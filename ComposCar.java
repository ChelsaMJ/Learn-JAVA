public class ComposCar {

    String model;
    int year;
    ComposEngine engine; // Composition: Engine is 'part of' car

    // Constructor
    ComposCar(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        // Instantiates a new Engine object inside the Car constructor
        this.engine = new ComposEngine(engineType);  // car object is COMPOSED of another obj that is engine
    }
    
    // Add a potential method for functionality (e.g., to demonstrate use)
    public void start() {
        System.out.println(this.model + " is starting...");
        this.engine.startEngine();
    }
    
}
