class ChildClass implements Runnable {
    public void run() {
        // System.out.println("Run() method of the ChildClass....");
        for(int i=1; i<=5; i++) {
            System.out.println("Child Thread : "+ i);
        }
    }
}
public class ImplementingRunnableDemo {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        Thread th = new Thread(cc);
        th.run();
    }
}
