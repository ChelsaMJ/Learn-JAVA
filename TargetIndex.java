import java.util.Scanner;

public class TargetIndex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean isFound = false; // why false? because initially we have not found the target element

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        
        System.out.print("Target element found at index: ");

        for(int i = 0; i < size; i++) {
            if(target == arr[i]){
                System.out.println(i);
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
