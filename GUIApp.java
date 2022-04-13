package Day24;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUIApp extends Frame{
	Button b1,b2;
	TextField t;
	public GUIApp() {
		setLayout(new FlowLayout());
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener((e) ->t.setText("Hello"));
		b2.addActionListener((e) ->t.setText(" "));
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}			
		});
		setSize(400, 500);
		setVisible(false);
		
}
	public static  void main (String[] args) {
		
		new GUIApp();
		
		
	}
}

