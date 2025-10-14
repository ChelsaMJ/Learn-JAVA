public class multiThreadMain {
    // Multithreading
    // Enables a program to run multiple threads concurrently
    // (Thread -  A set of instructions that run independently)
    // Useful for background tasks or time-consuming operations

    public static void main(String[] args) {

        // multiThreadRunnable mtr = new multiThreadRunnable();
        // Thread thread = new Thread(mtr);
        // thread.start();

        // this works too:
        // Thread thread1 = new Thread(new multiThreadRunnable());
        Thread thread1 = new Thread(new multiThreadRunnable("ping"));
        // multi thread: 
        Thread thread2 = new Thread(new multiThreadRunnable("pong"));

        // if u write like this:
            // System.out.println("start");
            // thread1.start();
            // thread2.start();
            // System.out.println("over");
        //output: 
        // start
        // over
        // ping pong until time ends
            

        System.out.println("start!!!!!!");
        thread1.start();
        thread2.start();

        try{
            thread1.join(); 
            thread2.join();
        }   
        catch(InterruptedException e){
            System.out.println("interrupted");

        }
        System.out.println("over!!!!!!");

    }
}
