import java.util.Scanner;

public class LogicalUsername {
    
    // setting username using logical operators
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // username mus tbe between 5 to 15 characters
        // musnt contain any space or underscores

        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        boolean isValid = (username.length() >= 5) && (username.length() <= 15) 
        && (!username.contains(" ")) && (!username.contains("_"));

        if (isValid) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }

}
