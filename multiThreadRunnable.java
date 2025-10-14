public class multiThreadRunnable implements Runnable {


    private final String text;

    multiThreadRunnable(String text){
        this.text=text;
    }


    @Override
    public void run() {

        // counter
        for (int i = 1; i <= 5; i++) {
            try {
                // Pause the thread for 1000 milliseconds (1 second)
                Thread.sleep(1000); 
                System.out.println(Thread.currentThread().getName()+" :"+i);
                
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        // access text passed
        for (int i = 1; i <= 5; i++) {
            try {
                // Pause the thread for 1000 milliseconds (1 second)
                Thread.sleep(1000); 
                System.out.println(text);
                
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}