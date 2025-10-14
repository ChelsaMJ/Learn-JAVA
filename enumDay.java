public enum enumDay {

    // Enum constants with their corresponding day numbers
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    // Private field to store the day number
    private final int dayNumber;

    // Enum constructor (always implicitly private)
    enumDay(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Public method to retrieve the day number
    public int getDayNumber() {
        return this.dayNumber;
    }
}