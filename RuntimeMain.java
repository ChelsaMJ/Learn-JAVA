import java.util.Scanner;

public class RuntimeMain {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    RuntimeAnimal animal;

    System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
    int choice = scanner.nextInt();
    if (choice == 1){
        animal = new RuntimeDog();
        animal.speak();
    }
    
    else if(choice == 2){
        animal = new RuntimeCat();
        animal.speak();
        }

    scanner.close();

    // which method to run is decided at runtime

    }
    
}
