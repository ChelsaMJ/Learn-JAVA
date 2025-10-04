import java.util.Scanner;

public class LogicalUsername2 {

    // username mus tbe between 5 to 15 characters
    // musnt contain any space or underscores
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.nextLine();


        if (username.length() < 5 || username.length() > 15) {
            System.out.println("Username must be between 5 to 15 characters");
        } 
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain space or underscore");
        }
        else {
            System.out.println("Welcome "+ username);
        }

        sc.close();
    }
    
}
