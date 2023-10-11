class Add extends Thread {
    public void run() {
        for(int i=0 ;i<5; i++) {
            System.out.println("Sum = "+ (i+1));
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
        System.out.println("Add thread executing....");
    }
} 
class Difference extends Thread {
    public void run() {
        for(int i=0 ;i<5; i++) {
            System.out.println("Difference = "+ (i-1));
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
        System.out.println("Difference thread executing....");
    }
} 
public class ThreadPriority {
    public static void main(String[] args) {
        Add a = new Add();
        Difference d = new Difference();

        a.setPriority(10);
        d.setPriority(1);
        a.start();
        d.start();
        Thread.State ts = a.getState();
        System.out.println("Addition thread state : "+ ts.toString());
    } 
}
