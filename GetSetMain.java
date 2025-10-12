public class GetSetMain {
    public static void main(String[] args) {
    
    
        GetSetCar car = new GetSetCar("Charger", "Yellow", 10000.0);

        // i can change attr
        // car.model = "Corvette";
        // i can always keep it permanant by making the attr PRIVATE
        // but cant acess them outside Car class, UNLESS by using getters and setters.

        // below code wont work when attr are private
        // System.out.println("Model: " + car.model + ", Color: " + car.color + ", Price: $" + car.price);


        // make getter methods in car class to acess values
        System.out.println("Model: " + car.getModel() + ", Color: " + car.getColor() + ", Price: " + car.getPrice() );


        car.setColor("Black");
        car.setPrice(500000);
        car.setPrice(-100); // wont work

        System.out.println("Model: " + car.getModel() + ", Color: " + car.getColor() + ", Price: " + car.getPrice() );


    }

}
