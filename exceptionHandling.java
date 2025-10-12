import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String args[])
   {
        try {
            System. out. println(1 / 0);  // dangerous code
         }
        catch(ArithmeticException e){ // exception name + variable to represent it
            System. out. println("CAN'T DIVIDE BY ZERO!");
        } 

        

        try (Scanner scanner = new Scanner(System.in)){ // try with resources - here, automatically closes scanner
            System. out. print("Enter a number: ");
            int number = scanner.nextInt();
            System. out. println (number) ;
         }
        catch(InputMismatchException e){ // needs to be imported
            System. out. println("That wasn't a number");
        }
        catch(Exception e){ // to catch all exceptions - can't be specific here - wont know what was wrong
            // SAFETY NET
            System. out. println("Something went wrong..."); // but if all ur specific exeptions fail, then

        }

        finally{ // will always execute, exception or not - used for cleanup
            // scanner.close(); // if u forget to close it, use this, or used for closing files (file handling)
            System.out.println("This always executes");
        }

}
}
