/*
    * ASSIGNMENT 04 :
    * To implement a Linear-Search program, on an array.
    * where array size and items in the array are specified by the user....
*/
import java.util.Scanner;

public class LinearSearch {
    public static void search(int[] A, int n, int search) {
        boolean flag = false;
        for(int i=0; i<n; i++) {
            if(A[i] == search) {
                flag = true;
                System.out.println("\nElement found at index "+ i +" (position "+ (i+1) +")");
            }
        }
        if(!flag) { System.out.println("\nElement not found !"); }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.print("Enter "+ n +" elements in the array : ");
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("\nEnter element to be searched : ");
        int search = sc.nextInt();
        search(array, n, search);
        
        sc.close(); // to prevent resource leak....
    }
}
