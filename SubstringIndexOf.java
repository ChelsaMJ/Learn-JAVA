
import java.util.*;

public class SubstringIndexOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        if(email.contains("@")) {

            // Extract substring from index 0 to 5 (exclusive)
            String username = email.substring(0, email.indexOf('@'));
            System.out.println("Username: " + username); 
        
            // Extract substring from index 7 to the end of the string
            String domain = email.substring(email.indexOf('@')+1);
            System.out.println("Domain: " + domain); 

        }
        else {
            System.out.println("Email should contain @");
        }
        
        scanner.close();
        
    }
}
