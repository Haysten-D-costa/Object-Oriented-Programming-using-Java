import java.io.*;

public class Input_02 {
    public static void main(String[] args) {
        try {
            int num1, num2, sum; // initialized to zero(default initialization)....
            System.out.println("Enter two numbers : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // creating a buferred reader object....

            num1 = Integer.parseInt(br.readLine());
            num2 = Integer.parseInt(br.readLine());
            sum  = num1 + num2;

            System.out.println("Sum : "+sum);
        } catch(IOException e) {}
    }
}
