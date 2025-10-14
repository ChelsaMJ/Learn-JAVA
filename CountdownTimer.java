import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {

    public static void main(String[] args) {
        // 1. Create a Timer object
        Timer timer = new Timer();
        Scanner scanner= new Scanner(System.in);
        System.out.println ("Enter # of seconds to countdown from:");
        int response= scanner.nextInt();

        // 2. Create a TimerTask object (the action to perform repeatedly)
        TimerTask task = new TimerTask() {

            // The countdown starts from 5
            int count = response;

            @Override
            public void run() {
                // Print the current count
                System.out.println(count);
                
                // Decrease the count
                count--;

                // Check if the countdown is finished
                if (count == 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    
                    // Stop the timer from scheduling any further tasks
                    timer.cancel();
                }
            }
        };

        // 3. Schedule the task
        // schedule(TimerTask task, long delay, long period)
        // delay: start immediately (0 milliseconds)
        // period: run every 1000 milliseconds (1 second)
        timer.scheduleAtFixedRate(task, 0, 1000);   

        scanner.close();
    }
}