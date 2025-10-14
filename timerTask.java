import java.util.TimerTask;

import java.util.Timer;

public class timerTask {
    public static void main(String args[]){
        Timer timer = new Timer();
        Timer timer1 = new Timer();

        System.out.println("Message:");

        TimerTask task = new TimerTask(){

            @Override
            public void run(){
            System.out.println("hello");

            }
        };

        TimerTask task1 = new TimerTask(){

            int count =3;
            @Override
            public void run(){
                System.out.println("Bye");
                count--;

                if(count <= 0){
                    System.out.println("Task1 complete!");
                    timer1.cancel(); // to make it finite

            }
            }
            
            
        };

        TimerTask task2 = new TimerTask(){

            @Override
            public void run(){
            System.out.println("Goodbye");

            }
        };

        timer.schedule(task, 1000); // perform task after 1000ms
        timer1.schedule(task1, 2000,500); // with stopage
        timer.schedule(task2, 4000, 1000); // perform task2 after 0ms but for every 1000ms - periodic

        // after periodic, if i want to cancel/stop:
        

    }
}
