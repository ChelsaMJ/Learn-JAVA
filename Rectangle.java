public class Rectangle extends Shape {

    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override // abstract methods need to be overriden // concrete methods are inherited
    double area() {
        return width * height;
    }
    
}
