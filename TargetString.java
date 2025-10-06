import java.util.Scanner;

public class TargetString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean isFound = false; // why false? because initially we have not found the target element

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        String[] fruits = new String[size];

        System.out.print("Enter the fruits: ");
        for(int i = 0; i < size; i++) {
            fruits[i] = sc.next();
        }

        System.out.print("Enter the target element: ");
        String target = sc.next();
        

        for(int i = 0; i < size; i++) {
            if(fruits[i].equals(target)){ // == would give address instead of comparing values
                System.out.println("Target found at: "+i);
                isFound = true; // why true? because we have found the target element
                break;
                }
            }

            if(!isFound){ // if isFound is false, then only print "Element not found"
                System.out.println("Element not found.");
            }

    sc.close();
}
}
