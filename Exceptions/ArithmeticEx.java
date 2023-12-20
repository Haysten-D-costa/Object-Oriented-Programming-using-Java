public class ArithmeticEx {
    public static void main(String[] args) {
        try {
            int a = 0;
            int result = 50 / a;
            System.out.println("Result is : "+ result);
        }
        catch(ArithmeticException e) { System.out.println("ERROR : "+ e); }
        System.out.println("Program end !");
    }
}
