/*
    * The Calculator class takes two integer inputs and an operator (+, -, *, /) and performs the
    * corresponding arithmetic operation.
*/
class Calculator {
    public static void main(String args[]) {
        
        char c;
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[2]);
        c = args[1].charAt(0);
        
        if(c == '+') {
            System.out.println("sum = "+(a + b));
        }
        else if(c == '-') {
            System.out.println("difference = "+(a - b));
        }
        else if(c == '*') {
            System.out.println("product = "+(a * b));
        }
        else if(c == '/') {
            System.out.println("quotient = "+(a / b));
        }
        else { 
            System.out.println("No operation done !"); 
        }
    }
}