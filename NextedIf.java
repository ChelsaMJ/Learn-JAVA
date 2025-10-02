import java.util.Scanner;

public class NextedIf {

    public static void  main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a student?(true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Are you a senior?(true/false): ");
        boolean isSenior = scanner.nextBoolean();

        double Price=9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get 20% and 10% discount.");
                Price *= 0.7;
                // (1−d1​)×(1−d2​) = discount
            }
            else{
                System.out.println("You get 10% discount.");
                Price *= 0.9;
                // Original price = 100%
                // After 10% off → remaining = 90% = 0.9
            }
        }
        else{
            if(isSenior){
                System.out.println("You get 20% discount");
                Price *= 0.8;
                // Remaining = 80% = 0.8
            }
            else{
                System.out.println("You pay full price.");  
                Price *= 1;
            }
        }

        System.out.printf("Your ticket price is $%.2f%n", Price);


        scanner.close();
    }
    
}
