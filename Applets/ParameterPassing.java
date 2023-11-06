import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParameterPassing extends Applet implements ActionListener
{   String wd;
    TextField t1,t2;
    Button button1;
    public void init()
    {	 wd=getParameter("wrd"); }
    public ParameterPassing()
    {  
        t1 = new TextField(15);
        t2 = new TextField(15);
        button1=new Button("synonym");
        add(new Label("word"));  
        add(t1);
        add(new Label("synonym")); 
        add(t2);
        add(button1);
        button1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {   
        if(wd.equals("giraffe"))
        {  t1.setText(wd);t2.setText("terrestial animal");}
        else
            t1.setText("invalid text");
    }
}
