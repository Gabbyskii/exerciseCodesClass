import java.util.Scanner;
import java.util.ArrayList; 

class DrinksMenuTest {
	public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in);

    System.out.println("Hvor gammel er du? ");
    String age = sc.nextLine();
    int ageNum = Integer.parseInt(age); 

    ArrayList<String> options = new ArrayList<String>();

    if(ageNum > 18){
      options.add("Gin & tonic");
      options.add("Beer");
      options.add("Vodka");
    }
    else {
    options.add("Juice");
    options.add("Sparkling water");
    options.add("Soda");
    }

   for(String drinks: options){
   	System.out.println("- " +drinks);
   }  

   System.out.println("Hvor mange drinks vil du bestille? ");
   int numberOfDrinks = Integer.parseInt(sc.nextLine());


 ArrayList<String> choices = new ArrayList<>();
   while(choices.size() < numberOfDrinks){
   	System.out.println("Vælg en drink fra listen");
   	String choice = sc.nextLine(); 
   	  choices.add("- "+ choice);
   }
   System.out.println("Værsgo: "+ choices);

  } 

}