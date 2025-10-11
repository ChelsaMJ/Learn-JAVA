public class ShapeMain {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // Cannot instantiate the abstract class Shape

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4);
        Rectangle rectangle = new Rectangle(4, 6);

        // overriden methods:
        System.out.println("Circle area: " + circle.area());
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Rectangle area: " + rectangle.area());

        // inherited methods:
        circle.display();
        triangle.display();
        rectangle.display();
    }
}



