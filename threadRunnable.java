public class threadRunnable implements Runnable{ // Runnable interface

    // any code u want to run anything on separate thread, place it in run method
    // runs in bg

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000); // Thread refers to current thread - main() thread
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i==5){
                System.out.println("Time's up!");
                System.exit(0); 
            }
        }
    }
    
}
