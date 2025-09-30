import java.util.*;

public class MathHypotenuse2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the two sides of a right triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();

        // hypotenuse = sqrt(a^2 + b^2)
        double hypotenuse = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));

        System.out.println("The length of the hypotenuse is: " + hypotenuse);

        scanner.close();
    }
}
