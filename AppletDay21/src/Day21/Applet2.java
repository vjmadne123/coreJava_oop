package Day21;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2 extends Applet {
	Button b1,b2;
	TextField t;
	public void init() {
		add(b1 =new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener(new A());	
		b2.addActionListener(new B());
	
		
	}
	class A implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			t.setText("HelloWorld");
		}
		
	}
	class B implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			t.setText("");
		}
		
	}


}
