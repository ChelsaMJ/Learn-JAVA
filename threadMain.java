// Threading = Allows a program to run multiple tasks simultaneously
// Helps improve performance with time-consuming operations
// (File 1/0, network communications, or any background tasks)
// How to create a Thread
// Option1. Extend the Thread class (simpler) --> limited to single inheritance
// Option2. Implement the Runnable interface (betterl)


import java.util.Scanner;
import java.lang.Thread;
import java.lang.InterruptedException;

public class threadMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 5 seconds to enter your name");

        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000); // Thread refers to current thread - main() thread
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i==5){
                System.out.println("Time's up!");

            }
        }
        // problem: above loop cant access below code cuz loop continues ---> so create another thread
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Hello " + name);
        
        scanner.close();
    }
}