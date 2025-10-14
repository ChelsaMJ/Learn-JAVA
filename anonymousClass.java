

public class anonymousClass {
    public static void main(String args[]){

        // Anonymous
        // A class that doesn't have a name. Cannot be reused.
        // Add custom behavior without having to create a new class.
        // Often Used for one time Uses (TimerTask, Runnable, callbacks)

        Cat cat1 = new Cat();
        Cat cat2 = new Cat(){
            @Override
            void speak(){
                System.out.println("I am Chat Noir! Meow");
            }
        };

        cat1.speak();
        cat2.speak();

    }}