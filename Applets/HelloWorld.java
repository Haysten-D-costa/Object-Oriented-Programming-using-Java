import java.applet.*;
import java.awt.*;

public class HelloWorld extends Applet {
    
    String str;
    public void init() {
        str = "Hello World !";
    }
    public void paint(Graphics g) {
        g.drawString(str, 0, 0);
    }
}
