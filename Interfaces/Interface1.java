interface A {
    void method01();
    void method02();
}
interface B extends A {
    void method03();
}
class BMajor implements B {
    public void method01() { System.out.println("method01()"); }
    public void method02() { System.out.println("method02()"); }
    public void method03() { System.out.println("method03()"); }
}

public class Interface1 {
    public static void main(String[] args) {
        BMajor bm = new BMajor();
        bm.method01();
        bm.method02();
        bm.method03();
    }
}
