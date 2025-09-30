import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double breadth = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = breadth * length;
        System.out.println("Area of Rectangle: " + area);

        scanner.close();

        
    }
}