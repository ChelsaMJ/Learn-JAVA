import java.util.Scanner;
import java.lang.Thread;

public class threadMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // this time, both threads run at same time, hence msg Time's up will be printed
        // while main prgm is running, run() is running in bg 
        // program doesnt end until all threads r done

        threadRunnable tr = new threadRunnable();
        Thread thread = new Thread(tr);
        // set 2nd thread as Daemon thread - it ends right after main thread ends
        thread.setDaemon(true); // ends main thread after input
        // BUT need to end other thread run() with exit(0), else it waits for input if not entered
        thread.start();

        System.out.println("You have 5 seconds to enter your name");



        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Hello " + name);
        
        scanner.close();

    }
}