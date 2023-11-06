import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
import java.time.format.TextStyle;

public class applet02 extends Applet {
    private Label nameLabel;
    private TextField nameTextField;

    public void init() {
        nameLabel = new Label("Enter your name: ");
        nameTextField = new TextField(20);

        add(nameLabel);
        add(nameTextField);
    }
}
