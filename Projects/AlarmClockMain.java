package Projects;

import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClockMain {

    public static void main(String[] args) {
        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "D:\\Learn JAVA\\Projects\\Make You Mine.wav";    

        // Loop to repeatedly ask for alarm time until valid format is entered
        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }

        // Create the AlarmClock task and run it on a new thread
        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
        
        // Note: The scanner is not closed here because it is passed to the AlarmClock 
        // and is closed within the AlarmClock's run() method.
    }
}
