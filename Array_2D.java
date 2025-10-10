public class Array_2D {
    public static void main(String[] args) {
        
        String[] fruits = {"Apple", "Mango", "Banana"};
        String[] vegetables = {"Potato", "Tomato", "Cabbage"};
        String[] meats = {"Chicken", "Beef", "Mutton"};

        String[][] grocery = {fruits, vegetables, meats}; // each element is an array

        for(String[] section : grocery){ 
            for(String item : section){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
