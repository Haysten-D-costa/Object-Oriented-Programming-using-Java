import java.applet.*;
import java.awt.*;

public class applet01 extends Applet {
    
    String str = "-> ";

    public void init() {
        setBackground(Color.RED);
        setForeground(Color.BLACK);
        str += " {inside init() method} -> ";
    }
    public void start() { str += " {inside start() method} -> "; }
    public void paint(Graphics g) {
        str += " {inside paint() method} ";
        g.drawString(str, 20, 20);
    }
}
