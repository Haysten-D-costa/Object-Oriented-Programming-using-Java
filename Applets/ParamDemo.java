import java.awt.*;
import java.applet.*;

/*
    <applet code="ParamDemo.class" width="500px" height="500px">
        <param name="fname" value="Haysten Dcosta">
    </applet>
*/

public class ParamDemo extends Applet {
    
    String name;
    public void init() {
        name = getParameter("name");
        name = "Hello "+ name;
    }
    public void paint(Graphics g) {
        g.drawString(name, 0, 0);
    }
}