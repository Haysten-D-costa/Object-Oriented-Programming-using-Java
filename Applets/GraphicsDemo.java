import java.applet.*;
import java.awt.*;

public class GraphicsDemo extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawLine(10, 10, 50, 50);
        g.drawRect(20, 20, 10, 30);
        g.fillRect(20, 20, 10, 30);
        g.drawRoundRect(10, 100, 80, 50, 10, 10);
        g.fillRoundRect(10, 100, 80, 50, 10, 10);
        g.setColor(Color.RED);
        g.fillArc(50, 50, 100, 50, 45, 45);
        g.fillOval(60, 200, 100, 50);
    }
}
