public class EnhancedSwitch {
    public static void main(String[] args) {
        String day = "FRIDAY";
        switch (day) {
            case "MONDAY" -> System.out.println(1);
            case "TUESDAY" -> System.out.println(2);
            case "WEDNESDAY" -> System.out.println(3);
            case "THURSDAY" -> System.out.println(4);
            case "FRIDAY" -> System.out.println(5);
            case "SATURDAY" -> System.out.println(6);
            case "SUNDAY" -> System.out.println(7);
            default -> System.out.println("Invalid day: " + day);

            
        };

    

        
    }
}
