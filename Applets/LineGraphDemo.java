import java.awt.*;
import java.applet.*;

public class LineGraphDemo extends Applet {
    int x[] = { 0, 60, 120, 180, 240, 300, 360, 420 };
    int y[] = { 400, 280, 220, 140, 60, 60, 100, 220 };

    // int x[]={25, 145, 25, 145, 25};
    // int y[]={25, 25, 145, 145, 25};
    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.drawPolygon(x, y, x.length);
        g.drawString("0,400", 0, 400);
        g.drawString("60,280", 60, 280);
        g.drawString("120,220", 120, 220);
        g.drawString("180,140", 180, 140);
        g.drawString("240,60", 240, 60);
        g.drawString("300,60", 300, 60);
        g.drawString("360,100", 360, 100);
        g.drawString("420,220", 420, 220);
    }
}
