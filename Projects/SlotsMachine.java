package Projects;

import java.util.Scanner;
import java.util.Random;

public class SlotsMachine {
    public static void main(String[] args){

        // JAVA SLOTS MACHINE

        Scanner scanner = new Scanner(System.in);

        // DECLARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // DISPLAY WELCOME MESSAGE
        System.out.println("Welcome to Java Slots!");
        System.out.println(" Symbols: ∞ █ ≈ ╬ ▒");

        // PLAY IF BALANCE > O
        while(balance > 0){

            System.out.println("Current balance: $"+balance);

            // ENTER BET AMOUNT
            System.out.print("Place your bet amount: $");
            bet = scanner.nextInt();
            scanner.nextLine(); // this will take the \n from nextInt() function above

            if(bet>balance){ // VERIFY IF BET > BALANCE
                System.out.println("Insufficient balance.");
                continue;
            }
            else if(bet<=0){ // VERIFY IF BET > O
                System.out.println("Amount can't be zero/less.");
                continue;
            }
            else{
                balance -= bet; // SUBTRACT BET FROM BALANCE
            }

            // SPIN ROW
            System.out.println("Spinning...");
            row = spinRow();
            // PRINT ROW
            printRow(row);
            // GET PAYOUT
            payout = getPayout(row, bet);
            if(payout>0){
                System.out.println("You won: $"+payout);
                balance+=payout;

            }
            else{
                System.out.println("Sorry u lost this round.");
            }


            // ASK TQ PLAY AGAIN
            System.out.print("Do you wanna play again?(Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }

        }

        // DISPLAY EXIT MESSAGE

        System.out.println("GAME OVER! Final balance: $"+balance);

        scanner.close();
        
    }
    // spinRow method
    static String[] spinRow(){

        String[] symbols ={"∞", "█", "≈", "╬", "▒"};

        Random random = new Random();
        String row[] = new String[3];

        for(int i=0; i<3;i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
 
    // printRow method
    static void printRow(String[] row){

        System.out.println(" "+String.join(" | ", row));
    }

    // getPayout method
    static int getPayout(String[] row, int bet){
        
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "∞"-> bet*3;
                case "█"-> bet*4;
                case "≈"-> bet*5;
                case "╬"-> bet*10;
                case "▒"-> bet*20;
                default -> 0;
                };
        }

        if(row[0].equals(row[1])){
            return switch(row[0]){
                case "∞"-> bet*2;
                case "█"-> bet*3;
                case "≈"-> bet*4;
                case "╬"-> bet*5;
                case "▒"-> bet*10;
                default -> 0;
                };
        }

        if(row[1].equals(row[2])){
            return switch(row[1]){
                case "∞"-> bet*2;
                case "█"-> bet*3;
                case "≈"-> bet*4;
                case "╬"-> bet*5;
                case "▒"-> bet*10;
                default -> 0;
                };
        }

        return 0;

    }

}
