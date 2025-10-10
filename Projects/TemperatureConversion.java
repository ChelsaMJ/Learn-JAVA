package Projects;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        String unit = scanner.next().toUpperCase();
        // char unit = scanner.next().toUpperCase().charAt(0);

        double convertedTemp = (unit.equals("C")) 
            ? (temperature - 32) * 5 / 9 
            : (temperature * 9 / 5) + 32;

        System.out.printf("Converted temperature: %.2f °%s%n", convertedTemp, unit);

        

        scanner.close();
               
}
}
