import java.util.Scanner;

public class ConditionalStmts {
    public static void main(String[] args) {
        
        //? if-else....
        /*
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age > 18) {
            System.out.println("Eligible....");
        } else {
            System.out.println("Not eligible....");
        }
        */
        
        //? enhanced for loop....
        /*
        int A[] = {1, 2, 3, 4, 5};
        for(int i : A) {
            System.out.print(i+" ");
        }
        */

        //? switch....
        /*
        Scanner sc = new Scanner(System.in);
        String choice = "jan";
        
        switch(choice) {
            case "j"  : // this switch is selected when the choice is j/jn/jan....
            case "jn" :
            case "jan": 
                System.out.println("January"); break;

            case "feb": 
                System.out.println("Februar"); 
                break;
            case "mar": 
                System.out.println("January"); 
                break;
            case "apr": 
                System.out.println("January"); 
                break;
            case "may": 
                System.out.println("January"); 
                break;
            case "jun": 
                System.out.println("January"); 
                break;
            case "jul": 
                System.out.println("January"); 
                break;
            case "aug": 
                System.out.println("January"); 
                break;
            case "sep": 
                System.out.println("January"); 
                break;
            case "oct": 
                System.out.println("January"); 
                break;
            case "nov": 
                System.out.println("January"); 
                break;
            case "dec": 
                System.out.println("January"); 
                break;
            default : System.out.println("Not a month !");
        }
        */
        // program to find sum of 'n' natural numbers....
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 0) {
            sum += n;
            n--; 
        }
        System.out.println("Sum : "+sum);
    }
}
