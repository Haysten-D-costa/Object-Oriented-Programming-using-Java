/**
 * The Grade class calculates the average of a student's marks and determines their grade based on the
 * average.
 */
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of subjects : ");
        int n = sc.nextInt();

        float[] marks = new float[n];

        float sum = 0;
        System.out.println("Enter marks scored in "+ n + " subjects : ");
        for(int i=0; i<n; i++) {
            marks[i] = sc.nextFloat();
            sum += marks[i];
        }
        float average = sum/n;
        
        if(average < 40) { System.out.println("FAILS"); }
        else if((average > 40) && (average < 50)) {
            System.out.println("\nYou've got a pass class....");
        }
        else if((average >= 50) && (average <= 70)) {
            System.out.println("\nYou've got a 2nd class....");
        }
        else if((average > 70) && (average < 85)) {
            System.out.println("\nYou've got a 1st class....");
        }
        else {
            System.out.println("\nYou've got a Distinction....");
        }
    } 
}
