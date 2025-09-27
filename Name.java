import java.util.Scanner;

public class Name{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    /*System.out.println("Skriv dit navn: ");
	String name = sc.nextLine();
	System.out.println("Hej, " + name);
    sc.nextLine(); // rydder linjeskiftet
    
    System.out.println("Skriv din alder: ");
    int age = sc.nextInt();
    System.out.println("Du er "+ age+ " år gammel.");
    System.out.println("Om 5 år er du "+ age + " + "+ 5 +" år gammel.");*/

    /*System.out.println("Hvad er din yndlingsret? ");
    String ret = sc.nextLine();
    System.out.println("Din yndlingsret er: " + ret);*/

    System.out.println("Skriv dit navn: ");
	String name = sc.nextLine();
	System.out.println("Hej, " + name);
    sc.nextLine(); 

    System.out.println("Skriv din alder: ");
    int age = sc.nextInt();
    System.out.println("Du er "+ age+ " år gammel.");
    sc.nextLine(); 
    
    System.out.println("Hvad er din yndlingsfarve? ");
    String farve = sc.nextLine();
    System.out.println("Din yndlingsfarve er: " + farve);
    sc.nextLine(); 

    System.out.println("Dette er: " + name + ". De er "+ age +" år gamle og deres yndlingsfarve er "+ farve);
    sc.close();
	}
}