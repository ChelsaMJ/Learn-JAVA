import java.util.Random;

public class RandomFunction {
    
    public static void main(String[] args) {


        // random numbers
        
        int num1;
        int num2;
        int num3;


        Random random = new Random();

        num1 = random.nextInt(1,20); 
        num2 = random.nextInt(1,7);
        num3 = random.nextInt(0,99);

        System.out.println(num1+" "+num2+" "+num3);


        // random double

        double d1;

        d1 = random.nextDouble();
        System.out.println(d1);


        //random boolean

        boolean isHeads;
        isHeads = random.nextBoolean();
        // System.out.println(isHeads);

        if(isHeads){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }   

    }
}
