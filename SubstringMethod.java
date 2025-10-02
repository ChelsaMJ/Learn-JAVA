public class SubstringMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Extract substring from index 0 to 5 (exclusive)
        String sub1 = str.substring(0, 5);
        System.out.println("Substring (0, 5): " + sub1); // Output: Hello
        
        // Extract substring from index 7 to the end of the string
        String sub2 = str.substring(7);
        String sub3 = str.substring(7,13); // this works too
        System.out.println("Substring (7): " + sub2); // Output: World!
        System.out.println("Substring (7,13): " + sub3); // Output: World!

    }
}
