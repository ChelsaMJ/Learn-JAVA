import java.util.Scanner;

public class TernaryPass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        
        int score = sc.nextInt();

        String passOrFail = (score >= 50) ? "Pass" : "Fail";

        System.out.println(passOrFail);

        sc.close();

    }
}
