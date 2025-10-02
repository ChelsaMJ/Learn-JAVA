import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declare variables
        double w1, w2;
        int choice;


        // welcome message
        System.out.println("Welcome to Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        
        // prompt for user choice

        System.out.print("Enter your choice (1 or 2): ");
        choice = scanner.nextInt();

        // option 1: convert lbs to kgs

        if(choice == 1){

            System.out.print("Enter weight in lbs: ");
            w1 = scanner.nextDouble();
            w2 = w1 * 0.453592;
            System.out.printf("%.2f lbs is equal to %.2f kgs\n", w1, w2);

        }
        // option 2: convert kgs to lbs
        else if(choice == 2){

                System.out.print("Enter weight in kgs: ");
                w1 = scanner.nextDouble();
                w2 = w1 / 0.453592;
                System.out.printf("%.2f kgs is equal to %.2f lbs\n", w1, w2);

            }
            // else print invalid choice
        else{
                System.out.println("Invalid choice! Please select 1 or 2.");
            }
        

        

        

        
        scanner.close();
    }
}
