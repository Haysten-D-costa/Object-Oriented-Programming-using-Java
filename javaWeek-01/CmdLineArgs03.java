/*
    * The above Class takes numbers as command line arguments and prints the sum....
*/
public class CmdLineArgs03 {
    public static void main(String[] args) {

        float sum = 0;
        for(String str : args) {
            sum += Float.parseFloat(str);
        }
        System.out.println("\nSum of the numbers is : "+ sum);
    }
}
