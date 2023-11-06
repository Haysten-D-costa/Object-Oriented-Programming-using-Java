import java.applet.*;
import java.awt.*;

public class ClockDemo extends Applet implements Runnable {

    int width, height;
    int i = 0;
    Thread t = null;
    boolean threadSuspended;

    public void start() {
        System.out.println("start(): begin");
        if (t == null) {
            System.out.println("start(): creating thread");
            t = new Thread(this);
            System.out.println("start(): starting thread");
            threadSuspended = false;
            t.start();
        } else {
            if (threadSuspended) {
                threadSuspended = false;
                System.out.println("start(): notifying thread");
                synchronized (this) {
                    notify();
                }
            }
        }
        System.out.println("start(): end");
    }

    // Executed whenever the browser leaves the page containing the applet.
    public void stop() {
        System.out.println("stop(): begin");
        threadSuspended = true;
    }

    // Executed within the thread that this applet created.
    public void run() {
        System.out.println("run(): begin");
        try {
            while (true) {
                System.out.println("run(): awake");

                ++i;
                if (i == 4) {
                    i = 0;
                }
                System.out.println("run(): requesting repaint");
                repaint();
                System.out.println("run(): sleeping");
                Thread.sleep(1000); // interval given in milliseconds
            }
        } catch (InterruptedException e) {
        }
        System.out.println("run(): end");
    }

    // Executed whenever the applet is asked to redraw itself.
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillOval(0, 0, 100, 100);
        g.setColor(Color.black);
        g.drawOval(45, 45, 10, 10);
        g.fillOval(45, 45, 10, 10);
        g.drawString("12", 50, 15);
        g.drawString("3", 90, 50);
        g.drawString("6", 50, 90);
        g.drawString("9", 10, 50);
        g.drawLine(75, 7, 69, 12);
        g.drawLine(94, 25, 88, 29);
        g.drawLine(94, 75, 89, 70);
        g.drawLine(75, 94, 70, 89);
        g.drawLine(25, 94, 30, 89);
        g.drawLine(6, 75, 10, 70);
        g.drawLine(6, 38, 11, 43);
        g.drawLine(25, 13, 30, 18);
        if (i == 0)
            g.drawLine(50, 50, 50, 0);
        if (i == 1)
            g.drawLine(50, 50, 100, 50);
        if (i == 2)
            g.drawLine(50, 50, 50, 100);
        if (i == 3)
            g.drawLine(50, 50, 0, 50);
    }
}
