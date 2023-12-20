public class VarArgs {
    public static int sum(int...i) {
        int sum = 0;
        for(int k : i) {
            sum += k;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 1, 1, 1, 1, 1, 1, 1, 1));
    }
}