import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // declare variables
        int numOfDice;
        int total = 0;
        
        // get # of dice from user
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        // check if # of dice > 0
        if (numOfDice > 0) {
            System.out.println("Rolling " + numOfDice + " dice...");

            // roll all the dice    
            for (int i = 0; i < numOfDice; i++) {
                int rollValue = random.nextInt(6) + 1; // Roll a die (1-6)
                displayDie(rollValue); // Display the die face
                total += rollValue;
                System.out.println("Die " + (i + 1) + ": " + rollValue);
            }
            // get the total
            System.out.println("Total---> " + total);
            
        } else {
            System.out.println("Number of dice must be greater than 0.");
        }

        scanner.close();

        
        
    }
    // display ascii of dice
    static void displayDie(int value) {
        

        // symbols pasted with WIN + R > charmap > select music note > select > copy > paste
        String dice1= """
         ---------
        |         |
        |    ♪    |
        |         |
         ---------   """;

         String dice2= """
         ---------
        | ♪       |
        |         |
        |       ♪ |
         ---------   """;

         String dice3= """
         ---------
        | ♪       |
        |    ♪    |
        |       ♪ |
         ---------   """;

         String dice4= """
         ---------
        | ♪     ♪ |
        |         |
        | ♪     ♪ |
         ---------   """;


         String dice5= """
         ---------
        | ♪     ♪ |
        |    ♪    |
        | ♪     ♪ |
         ---------   """;


         String dice6= """
         ---------
        | ♪     ♪ |
        | ♪     ♪ |
        | ♪     ♪ |
         ---------   """;

         switch (value) {
            case 1 :
                System.out.println("---------\n|       |\n|   *   |\n|       |\n---------");
                System.out.println(dice1);
                break;
            case 2:
                System.out.println("---------\n| *     |\n|       |\n|     * |\n---------");
                System.out.println(dice2);

                break;
            case 3:
                System.out.println("---------\n| *     |\n|   *   |\n|     * |\n---------");
                System.out.println(dice3);

                break;
            case 4:
                System.out.println("---------\n| *   * |\n|       |\n| *   * |\n---------");
                System.out.println(dice4);

                break;
            case 5:
                System.out.println("---------\n| *   * |\n|   *   |\n| *   * |\n---------");
                System.out.println(dice5);

                break;

            case 6:
                System.out.println("---------\n| *   * |\n| *   * |\n| *   * |\n---------");
                System.out.println(dice6);

                break;
            default:
                System.out.println("Invalid die value.");
        }

    }


}
