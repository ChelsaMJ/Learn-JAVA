import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        // JAVA BANKING PROGRAM FOR BEGINNERS

        Scanner scanner = new Scanner(System.in);
        // DECLARE VARIABLES

        int choice;
        double amount;
        double balance = 0;



        
        // DISPLAY MENU
        System.out.println("----------------------------");
        System.out.println("Welcome to the Banking Program");
        System.out.println("----------------------------");

        do {
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
            case 1:
                // SHOW BALANCE
                showBalance(balance);
                break;
            case 2:
                // DEPOSIT
                System.out.print("Enter amount to deposit: $");
                amount = scanner.nextDouble();
                balance = deposit(balance, amount);
                showBalance(balance);
                break;
            case 3:
                // WITHDRAW
                System.out.print("Enter amount to withdraw: $");
                amount = scanner.nextDouble();
                balance = withdraw(balance, amount);
                showBalance(balance);
                break;
            case 4:
                // EXIT MESSAGE
                System.out.println("Thank you for using the Banking Program. Adiós!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }     while (choice != 4);
        
        
        scanner.close();

    }
    // Methods :
        // showBalance() method
        static void showBalance(double balance) {
            System.out.printf("Your current balance is: $%.2f%n", balance);
        }

        // deposit()
        static double deposit(double balance, double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.printf("Successfully deposited $%.2f%n", amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
            return balance;
        }

        // withdraw()
        static double withdraw(double balance, double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.printf("Successfully withdrew $%.2f%n", amount);
            } else if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
            return balance;
        }
}
