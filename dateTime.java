import java.time.LocalTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTime {
    public static void main(String args[]){

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now(); //utc


        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        // custom format using DateTimeFormatter

        LocalDateTime dateTime2 = LocalDateTime.now() ;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("dd-MM-yyyy HH:mm:ss");
        
        String newDateTime = dateTime2.format (formatter) ; // format the dateTime2 to formatter
        
        System. out. println (newDateTime) ;
        

        // custom date-time object for a date
        LocalDateTime date1 = LocalDateTime.of(2024,12, 25, 12, 0, 0); // (2024: y,12: m, 25: d, 12: h, 0: m, 0: s)
        LocalDateTime date2 = LocalDateTime.of(2025,1, 1, 0, 0, 0);

        //comparing them
        if (date1.isAfter(date2)){
            System.out.println(date1+" is later than "+date2);
        }
        else if(date1.isBefore(date2)){
            System.out.println(date1+" is earlier than "+date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1+" is equal to "+date2);
        }


    }
    
}
