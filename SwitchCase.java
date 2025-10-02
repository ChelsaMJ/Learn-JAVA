import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toLowerCase();

        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("Weekday");
            case "saturday", "sunday" -> System.out.println("Weekend");
            default -> System.out.println(day + "is not a day :(");
        }

        scanner.close();
    
    }
}
