import java.util.Scanner;

public class scIssue{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        String name = scanner.nextLine();

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        
        scanner.close();
    } 
}