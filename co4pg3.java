import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class co4pg3 extends Applet implements ActionListener
{
Button bcolor1,bcolor2;
Label bcolor;
String str;
public void init()
        {
            bcolor1 = new Button("Red");    
            bcolor2 = new Button("Blue");
             
            add(bcolor1);                  
            add(bcolor2);
 
            bcolor1.addActionListener(this); 
            bcolor2.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae)
        {
            str = ae.getActionCommand();
            repaint();      
        }
    public void paint(Graphics g)
    { 	
       int [] x = {150, 300, 225};
       int [] y = {150, 150, 25};
       g.setColor(Color.pink);
       g.fillRect(150, 150, 250, 200);
       g.setColor(Color.blue);
       g.fillRect(200, 200, 80, 150);
       g.setColor(Color.gray);
       g.fillRect(220, 30, 180, 120); 
       g.setColor(Color.blue);
       g.fillPolygon(x, y, 3);
       if(str.equals("Red"))
       {
			  g.setColor(Color.pink);
			  g.fillRect(150, 150, 250, 200);
                          g.setColor(Color.red);
			  g.fillRect(200, 200, 80, 150);
			  g.setColor(Color.gray);
			  g.fillRect(220, 30, 180, 120); 
			  g.setColor(Color.blue);
			  g.fillPolygon(x, y, 3);
        }
	if(str.equals("Blue"))
	{
			g.setColor(Color.pink);
			g.fillRect(150, 150, 250, 200);
                        g.setColor(Color.blue);
			g.fillRect(200, 200, 80, 150);
			g.setColor(Color.gray);
			g.fillRect(220, 30, 180, 120); 
			g.setColor(Color.blue);
			g.fillPolygon(x, y, 3);
        }
     }
}
