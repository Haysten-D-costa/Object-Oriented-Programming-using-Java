class ChildClass1 extends Thread {
    public void run() {
        try {
            // System.out.println("Run() method of the ChildClass1....");
            for(int i=1; i<=5; i++) {
                System.out.println("Child Thread 1 : "+ i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) { }
    }
}
class ChildClass2 extends Thread {
    public void run() {
        try {
            // System.out.println("Run() method of the ChildClass1....");
            for(int i=1; i<=5; i++) {
                System.out.println("Child Thread 2 : "+ i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) { }
    }
}
public class ExtendingThreadDemo {
    public static void main(String[] args) {
        
        ChildClass1 c1 = new ChildClass1();
        ChildClass2 c2 = new ChildClass2();
        c1.start();
        c2.start();
    }
}
