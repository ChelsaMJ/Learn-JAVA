import java.util.Scanner;

public class BankingProgramSimple {
    static Scanner scanner = new Scanner(System.in); // globally accessed
    public static void main(String[] args) {
        // JAVA BANKING PROGRAM FOR BEGINNERS

        
        // DECLARE VARIABLES

        int choice;
        double balance = 0;
        boolean isRunning = true;

        
        // DISPLAY MENU
        System.out.println("----------------------------");
        System.out.println("Welcome to the Banking Program");
        System.out.println("----------------------------");

        while(isRunning) {
        System.out.println("\n\n1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("----------------------------");

        // GET AND PROCESS USERS CHOICE
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        System.out.println("----------------------------");

        switch (choice) {
            case 1-> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid choice. Please try again.");
        }
    } // end of while loop

        System.out.println("Thank you for using the Banking Program. Goodbye!");
        
        
        scanner.close();

    }
    // Methods :
        // showBalance() method
        static void showBalance(double balance) {
            System.out.printf("Your current balance is: $%.2f%n", balance);
        }

        // deposit()
        static double deposit() {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble(); // no need to pass scanner as parameter since it's globally declared

            if (amount > 0) {
                System.out.printf("Successfully deposited $%.2f%n", amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
            return amount;
        }

        // withdraw()
        static double withdraw(double balance) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble(); // no need to pass scanner as parameter since it's globally declared

            if (amount <0) {
                System.out.println("Amount must be positive.");
                return 0;
            } else if (amount > balance) {
                System.out.println("Insufficient funds.");
                return 0;
            } else {
                return amount;}
        }
}
