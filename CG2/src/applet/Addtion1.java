package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;

public class Addtion1 extends Applet {
	TextField t1 ,t2, t3;
    Label l1 ;
    Button b1;
    
    public void init()
    {

    	add(t1 = new TextField(5));
    	add(l1 = new Label("+"));
    	add(t2 = new TextField(5));
    	add(b1 = new Button("="));
    	add(t3 = new TextField(5));
    	

    }
    public boolean action (Event e, Object o)
    {
    	if (e.target.equals(b1)) {
    		String s1 = t1.getText();
    		int a = Integer.parseInt(s1);
    		String s2 = t2.getText();
    		int b = Integer.parseInt(s2);
    		int c =a+b;
    		String s3 = String.valueOf(c);
    		t3.setText(s3);
    		
    	}
    	return true;
    }


}
