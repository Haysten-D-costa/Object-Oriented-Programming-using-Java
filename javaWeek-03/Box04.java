public class Box04 {

    double length, breadth, height;

    Box04() { 
        length = breadth = height = 1; 
    }
    Box04(double l, double b, double h) { 
        length = l;
        breadth = b;
        height = h;
    }
    Box04(Box04 b) {
        length = b.length;
        breadth = b.breadth;
        height = b.height;
    }
    void displayValues() {
        System.out.println("Box Details : \n");
        System.out.println("-> Length   : "+length);
        System.out.println("-> Breadth  : "+breadth);
        System.out.println("-> Height   : "+height);
    }
    protected void finalize() {
        System.out.println("\nObject destroyed !");
    }

    public static void main(String[] args) {
        Box04 b1 = new Box04();
        b1.displayValues();

        b1 = null;
        System.gc();
    }
}
