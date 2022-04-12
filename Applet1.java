package Day24;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class Applet1 extends Applet{

	public void init() {
		//add(b1 = new Button("Vlick"));
		//b1.addActionListener();
		addMouseMotionListener(new MouseMotionAdapter () {
			@Override
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				String i = String.valueOf(x);
				String j = String.valueOf(y);
				showStatus(i+", "+ String.valueOf(y));
				
			}
		});
		
	
	}

}
