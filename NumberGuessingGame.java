import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
    
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the minimum number: ");
        int min = sc.nextInt();
        System.out.print("Enter the maximum number: ");
        int max = sc.nextInt();
        
        int numberToGuess = random.nextInt(min, max+1); // Random number between 1 and 100
        int attempts=0;
        int guess;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("I have selected a number between %d and %d. Can you guess it?\n", min, max);

        // do while loop

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess); 
        
        scanner.close();
        sc.close();
    }
}
