package Projects;
import java.util.Scanner;

public class QuizGame {
    
    public static void main(String[] args) {
    
        // JAVA QUIZ GAME

        //QUESTIONS array[]
        String[] questions = {
            "What is the capital of France?",
            "What is 2 + 2?",
            "What is the largest planet in our solar system?"
        };

        // OPTIONS array[]
        String[][] options = {
            {"1) Berlin", "2) Madrid", "3) Paris", "4) Rome"},
            {"1) 3", "2) 4", "3) 5", "4) 6"},
            {"1) Earth", "2) Jupiter", "3) Mars", "4) Saturn"}
        };

        // DECLARE VARIABLES
        int[] answers ={3, 2, 2}; // correct answers to questions
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);


        // WELCOME MESSAGE
        System.out.println("-------------------------");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("-------------------------");



        // QUESTION (Loop)
        for(int i=0; i<questions.length;i++){
            System.out.println();
            System.out.println(questions[i]);

            // display options
            for(String option : options[i]){
                System.out.println(option);
            }

            // GET GUESS FROM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // CHECK OUR GUESS
            if(guess == answers[i]){
                System.out.println("CORRECT!");
                score++;
             }
            else{
                System.out.println("WRONG!");

            }

        }

        
        
        // DISPLAY FINAL SCORE
        System.out.println("\nFinal score ---------> "+ score + " out of "+ questions.length);
    
        scanner.close();
    }        
}
