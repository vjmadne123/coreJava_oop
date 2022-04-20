package Day28;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo2 extends Frame {
	TextField t1,t2;
	public ThreadDemo2() {
		setLayout(new FlowLayout());
		add(t1 = new  TextField(15));
		add(t2 = new  TextField(15));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(40,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		new ThreadDemo2();

	}

}
