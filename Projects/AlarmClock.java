package Projects;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import javax.sound.sampled.*;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    // Constructor to receive the alarm time, file path, and scanner
    public AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        // Loop while the current time is before the alarm time
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                // Pause for 1 second
                Thread.sleep(1000); 

                // Get current time components
                LocalTime now = LocalTime.now();
                
                // Print and overwrite the current time on the same line
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());

            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        
        // When loop finishes, the alarm time has been reached
        System.out.println("\n*** ALARM TIME REACHED! ***");
        
        // Alarm audio playback and interaction logic
        File audioFile = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start(); // Start the audio
            
            // Wait for user input to stop the alarm
            System.out.print("Press *Enter* to stop the alarm: ");
            scanner.nextLine();
            
            clip.stop(); // Stop the audio
            
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } finally {
            // Close the scanner resource when the thread finishes
            scanner.close(); 
        }
    }
}
