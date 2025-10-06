import java.util.Scanner;

public class FoodArray {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of foods: ");
        int size = scanner.nextInt();

        String foods[] = new String[size];

        for(int i=0; i< foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.next(); // nextLine was give new line characteras input for next iteration of scanner
        }       
        
        System.out.print("Your foods are: ");
        for(String food: foods){
            System.out.print(food+" ");
        }

        scanner.close();
    }
}
