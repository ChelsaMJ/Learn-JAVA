public class VehicleMain {
    
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.drive();
        bike.drive();
        boat.drive();

        System.out.println();

        // if i try to put 3 of em into an array:
        // Car[] cars = {car, bike, boat}; // error: Type mismatch: cannot convert from Boat to Car

        VehicleObject[] vehicles = {car, bike, boat}; // now the 3 of them do identify as vehicles
        // call each vehicle with for-each loop
        for(VehicleObject vehicle : vehicles){
            vehicle.drive();
        }

        // polymorphism can also be achieved using interfaces
        // refer VehicleObject2.java 
        System.out.println();

        Car2 car2 = new Car2();
        Bike2 bike2 = new Bike2();
        Boat2 boat2 = new Boat2();

        car2.go();
        bike2.go();
        boat2.go();

    }
}
