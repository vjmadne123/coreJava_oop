package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet1 extends Applet {
	Button b;
	TextField t;
	
	public void init() {
		b = new Button();
		t = new TextField();
		b.setLabel("SUBMIT");
		add(b);
		add(t);
	}

}
