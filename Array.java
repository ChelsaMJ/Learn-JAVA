public class Array {
    
    public static void main(String[] args) {
        
        String fruit = "apple"; // variable
        String[] fruits = {"apple"}; // array
        // same data type = strings

        System.out.println("Variable:"+fruit);
        int lenghtofFruit = fruit.length();
        System.out.println("Length of var: "+lenghtofFruit); // 5
        int lengthOfFruits = fruits.length;
        System.out.println("Length of array: "+lengthOfFruits); // 1


        System.out.println("Memory address: "+fruits); // gives memory address

        System.out.println("Value at id 1: "+fruits[0]); // gives value at index 0 --> cuz array us a reference datatype

        // System.out.println("Exception: "+fruits[1]); // gives exception cuz index 1 does not exist --> ArrayIndexOutOfBoundsException

        String[] moreFruits = {"pineapple", "banana", "mango", "orange"};

        System.out.print("Values in moreFruits array: ");
        for(int i=0; i< moreFruits.length; i++){
            System.out.print(moreFruits[i]+ " ");
        }
    }
} 
