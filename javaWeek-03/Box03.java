public class Box03 {
    
    double length, breadth, height;
    
    Box03() { 
        length = breadth = height = 1; 
    }
    Box03(double l, double b, double h) { 
        length = l;
        breadth = b;
        height = h;
    }
    Box03(Box03 b) {
        length = b.length;
        breadth = b.breadth;
        height = b.height;
    }
    public static Box03 addBoxes(Box03 a, Box03 b) {
        
        Box03 temp = new Box03();
        temp.length = a.length + b.length;
        temp.breadth = a.breadth + b.breadth;
        temp.height = a.height + b.height;

        return temp;
    }
    void displayValues() {
        System.out.println("Box Details : \n");
        System.out.println("-> Length   : "+length);
        System.out.println("-> Breadth  : "+breadth);
        System.out.println("-> Height   : "+height);
    }
    
    public static void main(String[] args) { /* ----------<MAIN METHOD>---------- */
        
        Box03 b1 = new Box03(); // default object....
        Box03 b2 = new Box03(5, 5, 5); // parameterised object....

        Box03 b3 = addBoxes(b1, b2); // sum of both(default + parameterised)....
        b3.displayValues(); // displaying the sum....
    }
}