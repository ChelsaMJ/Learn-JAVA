package Projects;
import java.util.Scanner;

public class CompoundInterestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount (P): $");
        double principal = scanner.nextDouble();

        // Input annual interest rate
        System.out.print("Enter the annual interest rate (r) in percentage: ");
        double annualRate = scanner.nextDouble() / 100;

        // Input number of times interest is compounded per year
        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int timesCompounded = scanner.nextInt();

        // Input number of years the money is invested or borrowed for
        System.out.print("Enter the number of years the money is invested or borrowed for (t): ");
        int years = scanner.nextInt();

        // Calculate compound interest
        double amount = principal * Math.pow((1 + annualRate / timesCompounded), timesCompounded * years);
        double compoundInterest = amount - principal;

        // Output the result
        System.out.printf("The compound interest after %d years is: $%.2f%n", years, compoundInterest);
        System.out.printf("The total amount after %d years is: $%.2f%n", years, amount);

        scanner.close();
    }
}
