import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        
    String name = "";
    Scanner sc = new Scanner(System.in);

    if(name.isEmpty()){
        System.out.println("Enter your name(if): ");
        name = sc.nextLine();
    }
    
    while(name.isEmpty()){
        System.out.println("Enter your name(while): ");
        name = sc.nextLine();
    }

    System.out.println("Hello " + name);

    String response="";
    System.out.println("Your are playing a game!");
    while(!response.equals("Q")){ // while response is not equal to Q
        
        System.out.print("Enter Q to quit: ");
        response = sc.nextLine().toUpperCase();
        
    }
    System.out.println("You quit the game!");



    sc.close();

}
}
