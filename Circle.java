public class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override // abstract methods need to be overriden // concrete methods are inherited
    double area() {
        return Math.PI * radius * radius;
    }
    
}
