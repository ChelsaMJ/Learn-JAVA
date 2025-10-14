import java.util.Scanner;

public class enumMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine().toUpperCase();
        
        try{
        // 1. Declare and initialize a variable of the enum type Day
        enumDay day = enumDay.valueOf(response);

        // 2. Print the enum constant (calls Day.SUNDAY.toString())
        System.out.println(day);

        // 3. Print the custom value associated with the enum constant 
        //    by calling the getDayNumber() method.
        System.out.println(day.getDayNumber());

        // Assuming 'Day day = Day.SUNDAY;' is defined before the switch block


        switch(day){
            // Case for weekdays, which share the same output
            // enum constants are readable
            // unlike case->1,2,3 etc
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday");
            // MONDAY is a enum ---> faster
            // "MONDAY" is a string
            
            // Case for weekend days, which share the same output
            case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
        }
    }
    catch(IllegalArgumentException e){
        System. out. println("enter a valid day");
    }

    scanner.close();
        
    }
}