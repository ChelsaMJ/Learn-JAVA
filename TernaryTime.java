import java.util.Scanner;

public class TernaryTime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hour(24-hr): ");
        
        int hours = sc.nextInt();

        String timeOfDay = (hours<12) ? "AM" : "PM";

        System.out.println(timeOfDay);

        sc.close();

    }
}
