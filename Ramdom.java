import static java.lang.Math.random;

public class Ramdom {
    public static void main(String[] args) {
        for(int i=0; i<=9; i++) {
            System.out.println((int)(random() * 10));
        }
    }
}
