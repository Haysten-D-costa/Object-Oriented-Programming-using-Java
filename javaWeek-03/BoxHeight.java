class Box {

    double length, breadth;
    Box() { length = breadth = 1; }
    Box(double l, double b) { 
        length = l;
        breadth = b;
    }
    void computeArea() {
        System.out.println("Surface area : "+(breadth * length));
    }
}
class BoxHeight extends Box {
    double height;
    BoxHeight() { height = 1; }
    BoxHeight(double l, double b, double h) {
        super(l,b);
        height = h;
    }
    void computeVolume() {
        System.out.println("Length  : "+length);
        System.out.println("Breadth : "+breadth);
        System.out.println("Height  : "+height);
        System.out.println("\n-> Volume  : "+length * breadth * height);
    }
    public static void main(String[] args) {
        BoxHeight b = new BoxHeight(1, 2, 3);
        b.computeVolume();
    }
}
