public class Triangle extends Shape {

    // double a, b, c;
    double base, height;

    Triangle(double base, double height) {
        // this.a = a;
        // this.b = b;
        // this.c = c;
        this.base = base;
        this.height = height;
    }

    @Override // abstract methods need to be overriden // concrete methods are inherited
    double area() {
        // double s = (a + b + c) / 2;
        // return Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return 0.5 * base * height;
    }
    
}
