import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Applet implements ActionListener {
    TextField num1, num2, sum, diff;
    Button button1, button2;

    public Calculator() {
        setLayout(new GridLayout(3, 2, 10, 15));
        setBackground(Color.cyan);
        num1 = new TextField(15);
        num2 = new TextField(15);
        sum = new TextField(15);
        diff = new TextField(15);
        button1 = new Button("sum");
        button2 = new Button("diff");
        add(new Label("Enter num1"));
        add(num1);
        add(new Label("Enter num2"));
        add(num2);
        add(new Label("sum"));
        add(sum);
        add(new Label("diff"));
        add(diff);
        add(button1);
        add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        double n1 = Double.parseDouble(num1.getText());
        double n2 = Double.parseDouble(num2.getText());
        if (button.equals("sum"))
            sum.setText("Sum=" + (n1 + n2));
        else
            diff.setText("diff" + (n1 - n2));
    }
}
