class NewThread extends Thread {
    String name;
    NewThread(String thread_name) {
        name = thread_name;
        System.out.println("New Thread : "+ this);
        start();
    }
    public void run() {
        for(int i=5; i>0; i--) {
            System.out.println(name +" : "+ i);
        }
        try {
                Thread.sleep(1000);
        } catch(InterruptedException e) { System.out.println(name +" interrupted."); }
        System.out.println(name +" exiting.");
    }
}
public class ThreadJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("Thread One is alive : "+ ob1.isAlive());
        System.out.println("Thread Two is alive : "+ ob2.isAlive());
        System.out.println("Thread Three is alive : "+ ob3.isAlive());
    }
}
