package Day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet1 extends Applet{
	
	Button b1,b2;
	static TextField t;
	public void init() {
		add(b1 =new Button("Click"));
		add(t= new TextField(15));
		add(b2= new Button("Clear"));
		b1.addActionListener(new Demo());
		b2.addActionListener(new Sample());

	}
	

}
class Demo implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//Applet1 a1 = new Applet1();
	    Applet1.t.setText("Hi everyOne");
		
	}
	
}
class Sample implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Applet1 a2 = new Applet1();
		Applet1.t.setText("");
		
	}
	
}