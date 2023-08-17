public class Box05 {
    
    static double length, breadth;
    final static double height;

    static
    { height = 2; length = 1; }
    
    static void viewDetails() {
        System.out.println("\nBox Details : \n");
        System.out.println("Length  : "+Box05.length);
        System.out.println("Breadth : "+Box05.breadth);
        System.out.println("Height  : "+Box05.height);
    }
    public static void main(String[] args) {
        Box05.viewDetails();
    }
}
