package Day21;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part5 extends Applet{
	Button b1,b2;
	TextField t;
	public void init() {
		add(b1= new Button("Click"));
		add(t = new TextField(15));
		add(b2= new Button("Clear"));
		b1.addActionListener((ActionEvent e) -> {t.setText(" Hello EveryOne I am Vijayalaxmi ");});
		//b1.addActionListener((e)-> {t.setText("welcome");});
		//b2.addActionListener(new ActionListener() {

			//public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//t.setText("");
			//}
			
		//});
		b2.addActionListener((e) ->t.setText(""));
	}
	

}
