package applet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Panel;

public class Applet5 extends Applet{
	public void init() {

}

}
class Panel1 extends Panel{
	Checkbox c1,c2,c3;
	CheckboxGroup g1;
	 public void Panel1() {
		 g1 =new CheckboxGroup();
		 setLayout(new GridLayout(3,1));
		 add(c1 = new Checkbox("Tour1", g1, true));
		 add(c2 = new Checkbox("Tour1", g1, true));
		 add(c3 = new Checkbox("Tour1", g1, true));

		 
	 }
	
	
}
class Panel2 extends Panel{
	
}
	
