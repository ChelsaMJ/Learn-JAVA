public class ArrayOfObjectsMain {
    

    public static void main(String args[]){

        // ArrayOfObjectsObject car1 = new ArrayOfObjectsObject("Mustang", "Red");
        // ArrayOfObjectsObject car2 = new ArrayOfObjectsObject("Corvette", "Blue");
        // ArrayOfObjectsObject car3 = new ArrayOfObjectsObject("Dodge", "Black");
        

        // ArrayOfObjectsObject[] cars = {car1, car2, car3};

        //OR
        ArrayOfObjectsObject[] cars = {
            new ArrayOfObjectsObject("Mustang", "Red"),
            new ArrayOfObjectsObject("Corvette", "Blue"),
            new ArrayOfObjectsObject("Dodge", "Black")
        };
        

        for(ArrayOfObjectsObject car: cars){
            car.drive();
        }

        for(ArrayOfObjectsObject car : cars){
            car.color = "White"; // white for all cars using FOR
        }

        for(ArrayOfObjectsObject car: cars){
            car.drive();
        }

    }
}
