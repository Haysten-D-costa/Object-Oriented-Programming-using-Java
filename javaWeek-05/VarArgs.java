public class VarArgs {
    static int sum(int...i) {
        int sum = 0;
        for(int k: i) {
            sum += k;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("2 arguments : "+ sum(2, 2));
        System.out.println("5 arguments : "+ sum(2, 2, 2, 2, 2));
    } 
}