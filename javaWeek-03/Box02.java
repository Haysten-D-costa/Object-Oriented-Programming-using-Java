class Box02 {

    double length, breadth, height;
    Box02() { 
        length = breadth = height = 1; 
    }
    Box02(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    Box02(Box02 b) {
        length = b.length;
        breadth = b.breadth;
        height = b.height;
    }
    void computeArea() {
        System.out.println("Area = "+length * breadth);
    }
    void computeVolume() {
        System.out.println("Volume = "+length * breadth * height);
    }
    public static void main(String[] args) { /* ----------<MAIN METHOD>---------- */
        
        Box02 b1 = new Box02(2, 3, 4);
        System.out.println("Box Details : \n");
        System.out.println("-> Length   : "+ b1.length);
        System.out.println("-> Breadth  : "+ b1.breadth);
        System.out.println("-> Height   : "+ b1.height);
    } 
}