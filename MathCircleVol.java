import java.util.*;

public class MathCircleVol {
    
    public static void main(String args[]){

        // circumference of circle = 2 * Math.PI * radius
        // area = Math.PI * radius * radius = Math.PI * Math.pow(radius, 2)
        // volume of sphere = (4.0/3.0) * Math.PI * Math.pow(radius, 3)


        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double circumference = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);
        double volume = (4/3)*Math.PI*Math.pow(radius,3);

        System.out.println(circumference);
        System.out.println(area);          
        System.out.println(volume);


        // printf

        System.out.printf("The circumference of circle is %.1f\n", circumference);
        System.out.printf("The area of circle is %.3f\n", area);
        System.out.printf("The volume of sphere is %.4f\n", volume);

        sc.close();
    }
}
