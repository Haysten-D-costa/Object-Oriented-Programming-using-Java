class ChildClass extends Thread {
    public void run() {
        System.out.println("Run() method of the ChildClass....");
    }
}
public class ExtendingThreadDemo {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.start();
    }
}