import java.applet.*;
import java.awt.*;

public class GraphicsDemo extends Applet {
    public void paint(Graphics g) {
        // g.setColor(Color.BLACK);
        // g.fillRect(0, 0, 100, 50); // to draw rectangle...
        // g.drawLine(120, 0, 120, 50); // to draw line...
        // g.drawOval(140, 0, 50, 50); // to draw circle...

        // g.drawOval(0, 0, 100, 100);
        // g.fillOval(25, 30, 10, 10);
        // g.fillOval(75, 30, 10, 10);
        // g.drawLine(50, 50, 50, 75);
        // g.drawArc(25, 65, 50, 25, 180, 180);

        g.drawOval(0, 0, 100, 50);
        g.drawLine(0, 25, 50, 100);
        g.drawLine(100, 25, 50, 100);
    }
}
