package Day20;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;

public class Applet2part1 extends Applet implements ActionListener {
	Button b1,b2;
	TextField t;
	public void init() {
		add(b1 = new Button ("Click"));
		add(t = new TextField(5));
		add(b2 = new Button("Clear"));
		b1.addActionListener(this);
		b2.addActionListener(  this);
		
	}
	@Override
	public void actionperformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(b1))
			t.setText("Hello Word");
		if(o.equals(b2))
			t.setText("");
		
				
		
		
	}
	

}
