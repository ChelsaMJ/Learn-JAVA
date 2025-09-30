import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // if-else for name
        if(name.isEmpty()){
            System.out.println("You didn't enter your name.");
        }
        else{
            System.out.println("Hello, " + name + "!");
        }


        // if-else for age

        if (age >= 60) {
            System.out.println("You are a senior.");
        }
        else if (age >= 18) {
            System.out.println("You are an adult.");
        } 
        else if(age < 0){
            System.out.println("You aren't born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child.");
        }


        // if-else for student status

        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");       
        }


        scanner.close();
    }
}
