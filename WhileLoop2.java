import java.util.Scanner;

// public class WhileLoop2 {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter age: ");
//         int age = scanner.nextInt();

//        // i wont be entering into while at all in this situation // *****
//          // while doestnt execute even once if condition is false  // *****

//         while(age<0){
//             System.out.println("Invalid age. Please enter a valid age: ");
//             age = scanner.nextInt();
//         }
//         System.out.println("Your age is: " + age);

//         scanner.close();

//     }

        
// }


public class WhileLoop2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;

        // here do while will execute at least once even if condition is false // *****
        // do while executes the block of code once before checking the condition // *****

        do{
            System.out.println("Invalid age. Please enter a valid age: ");
            age = scanner.nextInt();
        }while(age<0);
        System.out.println("Your age is: " + age);

        scanner.close();

    }
}