// Java program to Draw a Smiley using Java Applet
import java.applet.*;
import java.awt.*;

public class Smiley extends Applet {
	public void paint(Graphics g)
	{
		g.drawOval(0, 0, 150, 150); // Oval for face outline
		g.fillOval(40, 30, 15, 15); // Oval for left eye
		g.fillOval(90, 30, 15, 15); // Oval for right eye
		g.drawLine(75, 90, 75, 60); // Line for nose
		g.drawArc(50, 100, 50, 20, 180, 180); // Arc for smile
		g.drawLine(50, 110, 100, 110); // line to connect the arc (completes the smile)
	}
}
