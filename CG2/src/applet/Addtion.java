package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addtion extends Applet implements ActionListener{
	int v1, v2, Sum;
	TextField t1 = new TextField(5);
	TextField t2 = new TextField(5);
    Label l1 = new Label("Value 1: ");
    Label l2 = new Label("Value 2: ");
    Button b1 = new Button("=");
    public void init()
    {

    	add(l1);
    	add(t1);
    	add(l2);
    	add(t2);
    	add(b1);
    	b1.addActionListener(this);
    	

    }
    public void paint(Graphics g)
    {
    	g.drawString("sum =" +Sum, 20, 70);
    }
    public void actionPerformed(ActionEvent e)
    {
    	v1 = Integer.parseInt(t1.getText());
    	v2 = Integer.parseInt(t2.getText());
    	Sum = v1+v2;
    	repaint();
    }

    
	
	
	

}
