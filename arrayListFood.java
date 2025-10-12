import java.util.ArrayList;

import java.util.Scanner;

public class arrayListFood {
    public static void main(String args[]){

        Scanner scanner= new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        
        System. out. print ("Enter the # of food YOU WOUId like: ");
        int num0fFood =scanner. nextInt() ;
        scanner.nextLine() ;

        
        for(int i =1; i <= num0fFood; i++){
            System. out. print("Enter food #" + i+ ":");
            String food = scanner.nextLine();
            foods.add(food);
           
        }


        System.out.println(foods);

        scanner.close();
    }
}
