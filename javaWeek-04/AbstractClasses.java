abstract class Shape {
    double d1, d2;
    void setDimensions(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    abstract void area();
}
class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle : "+ (d1 + d2));
    }
}
class Triangle extends Shape {
    void area() {
        System.out.println("Area of Triangle  : "+ (0.5 * d1 + d2));
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        Shape s;
        s = new Triangle();
        s.setDimensions(2, 3);
        s.area();

        s = new Rectangle();
        s.setDimensions(1, 2);
        s.area();
    }
}
