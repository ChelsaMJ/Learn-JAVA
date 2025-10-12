public class ComposEngine {
    
    String type; // e.g., "V8", "Electric", "Hybrid"

    // Constructor
    ComposEngine(String engineType) {
        this.type = engineType;
        System.out.println("Engine of type " + this.type + " created.");
    }
    
    // Add a potential method for functionality (e.g., to be called by Car)
    public void startEngine() {
        System.out.println("The " + this.type + " engine is running.");
    }
}
