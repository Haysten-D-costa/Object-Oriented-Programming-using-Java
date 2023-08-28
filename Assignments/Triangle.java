/*
    * ASSIGNMENT 03 :
    * Create a class shape with dimensions d1, d2 and 
    * Create a class Triangle which extends class Shape and include a member function area to display the area of triangle....
*/
class Shape {
    double d1; // assume to be length...
    double d2; // assume to be height...

    Shape() { d1 = d2 = 1; }
    Shape(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}
public class Triangle extends Shape {

    Triangle(double l, double b) {
        super(l,b); // this will call the base class constructor -i.e- Shapes class....
    }
    void computeArea() {
        System.out.println("Area of triangle : "+ (0.5 * super.d1 * super.d2));
    }

    public static void main(String[] args) {
        Triangle r = new Triangle(5, 10);
        r.computeArea();
    }
}