package Day20;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public  class Applete20 extends Applet {
	final int i=11;
	public final void init() {
		
	}
}
public interface ActionListener extends EventListener{
	public abstract void actionperformed(ActionEvent e);
	
}
interface A{
	public default void m1() {
		System.out.println("Hello");
	}
	
}
interface B extends A{
	public default void m1() {
		System.out.println("hello Everyone");
	}
	
}
interface C extends A{
	public default void m1() {
		System.out.println("hello Students");
	}
}
interface D extends B,C{
	public default void m1() {
		B.super.m1();
	}
	
}