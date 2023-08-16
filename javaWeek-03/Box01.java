public class Box01 {
    
    double length, breadth, height;
    Box01() { 
        length = breadth = height = 1; 
    }
    Box01(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    Box01(Box01 b) {
        length = b.length;
        breadth = b.breadth;
        height = b.height;
    }
    void computeArea() {
        System.out.println("-> Area     : "+length * breadth);
    }
    void computeVolume() {
        System.out.println("-> Volume   : "+length * breadth * height);
    }
    void displayValues() {
        System.out.println("-> Length   : "+length);
        System.out.println("-> Breadth  : "+breadth);
        System.out.println("-> Height   : "+height);
    }

    public static void main(String[] args) { /* ----------<MAIN METHOD>---------- */
        Box01 b1 = new Box01();
        Box01 b2 = new Box01(1, 2, 3);
        Box01 b3 = new Box01(b1);

        System.out.println("\nBOX b1 : "); 
        b1.computeArea();
        b1.computeVolume();
        b1.displayValues();
        
        System.out.println("\nBOX b2 : "); 
        b2.computeArea();
        b2.computeVolume();
        b2.displayValues();
        
        System.out.println("\nBOX b3 : "); 
        b3.computeArea();
        b3.computeVolume();
        b3.displayValues();
    }
}
