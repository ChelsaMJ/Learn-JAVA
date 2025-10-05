public class OverloadedMethods {
    public static void main(String[] args) {
        
        add(5, 10);          // Calls the method with two int parameters
        add(5,10,10);      // Calls the method with 3 int parameters
    }

    static void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    static void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
}
