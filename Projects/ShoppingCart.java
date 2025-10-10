package Projects;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        double price;

        System.out.println("What item would you like to purchase?");
        item = scanner.nextLine();
        System.out.println("Enter quantity: ");
        quantity = scanner.nextInt();
        System.out.println("Enter price per item: ");
        price = scanner.nextDouble();

        double total = quantity*price;
        System.out.println("Total cost for " + quantity + " " + item + "(s) is: $" + total);


        scanner.close();

    }
}
