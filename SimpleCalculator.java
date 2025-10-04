import java.util.Scanner;

//simple calculator
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                scanner.close();
                return;
        }

        System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);

        scanner.close();
    }
}
