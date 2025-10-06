public class Array {
    
    public static void main(String[] args) {
        
        String fruit = "apple"; // variable
        String[] fruits = {"apple"}; // array
        // same data type = strings

        System.out.println(fruit);
        System.out.println(fruits); // gives memory address

        System.out.println(fruits[0]); // gives value at index 0 --> cuz array us a reference datatype

        System.out.println(fruits[1]); // gives exception cuz index 1 does not exist --> ArrayIndexOutOfBoundsException
    }
} 
