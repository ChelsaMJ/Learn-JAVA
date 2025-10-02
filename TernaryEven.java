import java.util.Scanner;

public class TernaryEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = sc.nextInt();

        String evenOrOdd = (num%2==0) ? "Even" : "Odd";

        System.out.println(evenOrOdd);

        sc.close();

    }
}
