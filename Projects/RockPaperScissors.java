package Projects;
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
    public static void main(String[] args){

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";


        // do-while 
        do{
            // GET CHOICE FROM THE USER
            System.out.print("Enter your move: ");
            playerChoice = scanner.nextLine().toLowerCase();

            // incase, user inputs smthng else:
            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid move!");
                continue; // skip that invalid iteration and continue from beginning
            }

            // GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.print("Computer: "+computerChoice);
            System.out.println();

            // CHECK WIN CONDITIONS
            if(playerChoice.equals(computerChoice)){ // playerChoice == computerChoice
                System.out.println("----------> Its a tie.");
            }
            else if(
                    playerChoice.equals("scissors") && computerChoice.equals("paper") || // playerChoice=="scissors" && computerChoice == "paper"
                    playerChoice.equals("paper") && computerChoice.equals("rock") || // playerChoice=="paper" && computerChoice == "rock"
                    playerChoice.equals("rock") && computerChoice.equals("scissors") // playerChoice=="rock" && computerChoice == "scissors"
                    ){
                System.out.println("----------> You WIN!");

            }
            else{
                System.out.println("----------> You LOSE!");

            }

            // ASK TO PLAY AGAIN?
            System.out.print("Play Again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        

        // GOODBYE MESSAGE
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
