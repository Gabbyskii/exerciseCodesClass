import java.util.Scanner;
import java.util.ArrayList;

class DrinksMenu implements escape{
    public static void main(String[] Args ){
        try (// Opretter Scanner til at læse bruger input
        Scanner scan = new Scanner(System.in)) {
            // Spørger brugeren om deres alder
            System.out.println("Hvor gammel er du? ");
            String age = scan.nextLine();
            
            // Konverterer alder fra string til integer
            int ageNumber = Integer.parseInt(age);
            
            // Opretter en ArrayList til at gemme drink muligheder
            ArrayList<String> options = new ArrayList<>();
            
            // Tjekker om brugeren er 18 år eller ældre
            if (ageNumber >= 18){ 
                // Tilføjer alkoholiske drinks hvis brugeren er myndig
                options.add("Gin & tonic");
                options.add("Cocktail");
                options.add("Beer");
            }
            else {
                // Tilføjer ikke-alkoholiske drinks hvis brugeren er mindreårig
                options.add("Milk");
                options.add("Juice");
                options.add("Water");
            }
            
            // Viser alle tilgængelige drink muligheder
            System.out.println("Du kan vælge mellem:");
            for (String drink: options) {
                System.out.println("- " + drink);
            }
            
            // Spørger hvor mange drinks brugeren vil bestille
            System.out.println("Hvor mange drinks vil du bestille?");
            int numberOfDrinks = Integer.parseInt(scan.nextLine());
            
            // Opretter en ArrayList til at gemme brugerens valg
            ArrayList<String> choices = new ArrayList<>();
            // Loop der fortsætter indtil brugeren har valgt det ønskede antal drinks
            while (choices.size() < numberOfDrinks ){
                System.out.println("Vælg en drink fra listen");
                String choice = scan.nextLine();
                // Tilføjer brugerens valg til choices ArrayList
                choices.add(choice);
            }
            
            // Viser brugerens valgte drinks
            System.out.println("- " + choices);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}