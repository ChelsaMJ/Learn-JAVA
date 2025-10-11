public abstract class Shape {
    
    abstract double area(); // ABSTRACT METHOD - need to be implemented by children

    void display(){ // CONCRETE METHOD - inherited by children
        System.out.println("This is a shape.");
    }

    
}
