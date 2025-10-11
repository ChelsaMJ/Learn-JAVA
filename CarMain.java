public class CarMain {
    public static void main(String[] args){

        CarObject car1 = new CarObject();

        System.out.println(car1.make); // attribute

        // System.out.println(car1.isRunning);
        // car1.isRunning = true; // this value taken
        // System.out.println(car1.isRunning);


        System.out.println();

        System.out.println(car1.isRunning);
        car1.start(); // method
        System.out.println(car1.isRunning); // becomes true after start()
        car1.stop();
        System.out.println(car1.isRunning); // becomes false after stop()

    }
}
