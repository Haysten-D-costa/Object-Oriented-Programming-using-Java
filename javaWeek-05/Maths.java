import static java.lang.Math.*;

public class Maths {
    public static void main(String args[]) {
        int inum1 = 2;
        double dnum1 = 3;
        System.out.println("min= " + min(dnum1, inum1));
        System.out.println("power= " + Math.pow(inum1, 4));
        System.out.println("random no generated= " + (int)(random() * 10));
    }
}