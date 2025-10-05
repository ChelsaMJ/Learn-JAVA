import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException{
        // for loop

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to start countdown: ");
        int startNumber = scanner.nextInt();

        for (int i = startNumber; i > 0; i--) { 
            System.out.println(i);
            Thread.sleep(1000); // Pause for 1 second
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}
