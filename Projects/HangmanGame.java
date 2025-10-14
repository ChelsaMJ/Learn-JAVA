package Projects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        // JAVA HANGMAN GAME

        String filePath = "D:\\Learn JAVA\\Projects\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        // 1. Read words from file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
            return; // Exit if the file isn't found
        } catch (IOException e) {
            System.out.println("Something went wrong");
            return; // Exit on other IO errors
        }

        // 2. Select a random word
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        // DEBUG: System.out.println("Word is: " + word); 
        
        // 3. Initialize game variables
        Scanner scanner = new Scanner(System.in);
        // Initialize wordState with underscores
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        
        // 4. Game welcome message
        System.out.println("********************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("********************************");
        
        // 5. Main Game Loop
        while (wrongGuesses < 6) {
            
            // Display current hangman state
            System.out.print(getHangmanArt(wrongGuesses));
            
            // Display current word state
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println(); // Newline after word state

            // Get guess from user
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);
            
            // Check if the guess is correct
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!\n");
                
                // Update wordState with the correct guess
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                
                // Check for win condition
                if (!wordState.contains('_')) {
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }

            } else { // Wrong guess
                wrongGuesses++;
                System.out.println("Wrong guess!\n");

                // Check for lose condition
                if (wrongGuesses >= 6) {
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("GAME OVER!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
        }
        
        // Close scanner after game ends
        scanner.close();
    }

    // 6. Helper function to generate hangman ASCII art
    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    ----
                    |   
                    |
                    |  
                    |  
                    """;
            case 1 -> """
                    ----
                    |   O
                    |   
                    |  
                    |  
                    """;
            case 2 -> """
                    ----
                    |   O
                    |   |
                    |  
                    |  
                    """;
            case 3 -> """
                    ----
                    |   O
                    |  /|
                    |  
                    |  
                    """;
            case 4 -> """
                    ----
                    |   O
                    |  /|\\
                    |    
                    |    
                    """;
            case 5 -> """
                    ----
                    |   O
                    |  /|\\
                    |  / 
                    |  
                    """;
            case 6 -> """
                    ----
                    |   O
                    |  /|\\
                    |  / \\
                    |  
                    """;
            default -> "";
        };
    }
}
