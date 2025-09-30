import java.util.Scanner;


public class MadLibsGame {
    public static void main(String[] args) {
        // This is a placeholder for the Mad Libs game implementation.
        System.out.println("Welcome to the Mad Libs Game!");

        String adjective1;
        String adjective2;
        String noun1;
        String adjective3;
        String verb1;   
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        adjective3 = scanner.nextLine();
        System.out.println("Enter a verb(ing): ");
        verb1 = scanner.nextLine();
        System.out.println("\nHere is your Mad Libs story:");

        System.out.println("\nToday i went to a " + adjective1 + " zoo.");
        System.out.println( "In an exhibit, i saw a " + noun1+"." );   
        System.out.println(noun1 + " was very " + adjective2 + " and it was " + verb1 + ".");
        System.out.println("I was " + adjective3 + "!");
    
    
        scanner.close();
    }
    
}
