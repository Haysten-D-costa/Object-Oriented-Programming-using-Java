import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ImageDemo  extends Applet implements ActionListener 
{
    Image img1,img2;Button b1,b2;String s;int flag=-1;
    public void init()
    {   b1=new Button("image1");
        b2=new Button("image2");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        img1=getImage(getCodeBase(),"t1.jpg");
        img2=getImage(getCodeBase(),"t2.jpg");
    }
    public void paint(Graphics g) 
    {  if(flag==1){g.drawImage(img1, 30,30, this);  }
       if(flag==2){g.drawImage(img2, 30,30, this);  }  
       if(flag==-1){g.drawString("button not clicked", 50,50);}
    }
   public void actionPerformed(ActionEvent e)
   {    String g=e.getActionCommand();
        if(g.equals("image1")){ flag=1;}
        if(g.equals("image2")){ flag=2;}
        repaint();
   }
}
