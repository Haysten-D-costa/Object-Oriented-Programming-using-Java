import java.awt.*;
import java.applet.*;

public class FontDemo extends Applet
{
    public void paint(Graphics g)
    {   g.setFont(new Font( "Serif", Font.BOLD, 24 ));
        g.drawString("San Serif", 10, 30);
    }
}
