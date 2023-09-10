/*
    * This class takes two integer inputs and an operator (+, -, *, /) and performs the
    * corresponding arithmetic operation, through the command line....
*/
class CmdLineArgs01 {
    public static void main(String args[]) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        char c = args[1].charAt(0);
        
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