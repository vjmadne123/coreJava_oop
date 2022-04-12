package Day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowListener;

public class GUIApp extends Frame{
	Button b1,b2;
	TextField t;
	public GUIApp() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener((e) ->t.setText("Hello"));
		b2.addActionListener((e) ->t.setText(" "));
		addWindowListener(new WindowListener());
		
		
}
	public static  void main (String[] args) {
		
	}
}

