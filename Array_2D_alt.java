public class Array_2D_alt {
    public static void main(String[] args) {

        // no need to specify 1d array separately
        
        String[][] grocery = {
            {"Apple", "Mango", "Banana"},   // fruits
            {"Potato", "Tomato", "Cabbage"}, // vegetables
            {"Chicken", "Beef", "Mutton"}    // meats
        }; // each element is an array

        for(String[] section : grocery){ 
            for(String item : section){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
