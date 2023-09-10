/*
    * Methods to take input in JAVA....
    * This Java program takes two integer inputs from the user, calculates their sum, and displays the
    * result. We can have other input types like : 
    *         -> next(), nextLine(), nextFloat(), nextDouble(), nextByte(), etc...
*/
import java.util.Scanner;

public class Input_01 {
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); // created a scanner object....
        int a = sc.nextInt(); // input a,
        int b = sc.nextInt(); // input b....
        int sum = a + b;
        
        System.out.println("Sum of numbers : "+ sum); // display the sum....
        sc.close();
    }
}