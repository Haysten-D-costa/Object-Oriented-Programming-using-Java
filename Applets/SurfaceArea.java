import java.applet.*;
import java.awt.*;

public class SurfaceArea extends Applet {
    TextField lengthdim, breadthdim, heightdim, surfacearea, volume;
    Button button1;

    public void init() {
        setLayout(new GridLayout(3, 2, 10, 15));
        lengthdim = new TextField(15);
        breadthdim = new TextField(15);
        heightdim = new TextField(15);
        surfacearea = new TextField(15);
        volume = new TextField(15);
        lengthdim.setText("1");
        breadthdim.setText("1");
        heightdim.setText("1");
        add(new Label("Enter the length"));
        add(lengthdim);
        add(new Label("Enter the breadth"));
        add(breadthdim);
        add(new Label("Enter the height"));
        add(heightdim);
        add(new Label("surfacearea"));
        add(surfacearea);
        add(new Label("volume"));
        add(volume);
    }

    public void paint(Graphics g) {
        double l = Double.parseDouble(lengthdim.getText());
        double b = Double.parseDouble(breadthdim.getText());
        double h = Double.parseDouble(heightdim.getText());
        Double dd = l * b;
        Double hh = l * b * h;
        surfacearea.setText(dd.toString());
        volume.setText(hh.toString());
    }

    public boolean action(Event event, Object object) {
        repaint();
        return true;
    }
}
