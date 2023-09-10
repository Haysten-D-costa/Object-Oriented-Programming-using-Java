class Box {
    double d1, d2;
    Box() {
        d1 = d2 = 1;
        System.out.println("HERE ");
    }
    Box(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    void computeArea() {
        System.out.println("Surface area : "+ (d1 * d2));
    }
}
class BoxHeight extends Box {
    double d1;
    BoxHeight() { d1 = 1; }
    BoxHeight(double l, double b, double h) {
        super(l, b);
        d1 = h;
    }
    void computeVolume() {
        System.out.println("Volume : "+ (super.d1 * super.d2 * d1));
    }
}

public class SuperKeyword { 
    public static void main(String[] args) {
        BoxHeight b = new BoxHeight(2, 3, 2);
        b.computeArea();
        b.computeVolume();
    }
}
 