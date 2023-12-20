class A extends Thread {
    public void run() {
        try {
            System.out.println("Thread A started ");
            for(int i=1; i<=5; i++) {
                System.out.println("Thread A : "+ i);
                Thread.sleep(1000);
            }
            System.out.println("Thread A stopped ");
        }
        catch(InterruptedException e) {}
    }
}
class B extends Thread {
    public void run() {
        try {
            System.out.println("Thread B started ");
            for(int i=1; i<=5; i++) {
                System.out.println("Thread B : "+ i);
                Thread.sleep(1000);
            }
            System.out.println("Thread B stopped ");
        }
        catch(InterruptedException e) {}
    }
}
class C extends Thread {
    public void run() {
        try {
            System.out.println("Thread C started ");
            for(int i=1; i<=5; i++) {
                System.out.println("Thread C : "+ i);
                Thread.sleep(1000);
            }
            System.out.println("Thread C stopped ");
        }
        catch(InterruptedException e) {}
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread Started ");
        A a = new A();
        B b = new B();
        C c = new C();

        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(a.getPriority()+1);
        c.setPriority(Thread.MIN_PRIORITY);
        a.start();
        b.start();
        c.start();
        System.out.println("Main Thread stopped ");
    }
}
