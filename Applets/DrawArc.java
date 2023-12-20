import java.awt.*;
import java.applet.*;

public class DrawArc extends Applet {
    public void paint(Graphics g) {
        g.drawOval(50, 50, 10, 10);
        g.drawArc(50, 50, 100, 100, 0, -180);
    }
}
