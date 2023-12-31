/*
 * This is multi-level inheritance.....
*/

class A {
    double d1;
    double d2;

    A() { d1 = d2 = 1; }
    A(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
        System.out.println("'A' Class constructor called !");
    }
}
class B extends A {
    B() { }
    B(double d1, double d2) {
        super(d1, d2);
        System.out.println("'B' Class constructor called !");
    }
}
class C extends B {
    C() { }
    C(double d1, double d2) {
        super(d1, d2);
        System.out.println("'C' Class constructor called !");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c = new C(1, 2);
        System.out.println(c.d1);
        System.out.println(c.d2);
    }
}
