public class NestTry {
    static void func() {
        try {
            throw new ArithmeticException("ERROR");
        } 
        catch(ArithmeticException e) { 
            System.out.println("Caught in func()...."+ e);
            throw e;
        }
    }
    public static void main(String args[]) {
        try {
            func();
        }
        catch(ArithmeticException e) {
            System.out.println("Caught in main()...."+ e);
        }
    }
}
