 package Day30;

import java.awt.Frame;
import java.awt.TextField;
class Task{
	
	int a=0;
	public void increment() {

		a++;
	}
	public void decrement() {
		a--;
	}
	public void showvalue() {
		System.out.println(a);
	}
}
class ThreadOne extends Thread {
	Task a1=null;
	public ThreadOne(Task a1) {
		// TODO Auto-generated constructor stub
		super();

		this.a1=a1;

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//a1.increment();
		a1.showvalue();
	}
	
	
	}

	

public class MultiThreads implements Runnable
{
	Task a2=null;

	
	public MultiThreads(Task a2) {
		super();
		this.a2=a2;
		
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		a2.decrement();
		a2.showvalue();
	}
	
	
	public static void main(String[] args) {
		Task t= new Task();
		ThreadOne to = new ThreadOne(t);
		MultiThreads too = new MultiThreads(t);
		Thread th1 =new Thread(to);
		Thread th2 =new Thread(too);
		th1.start();
		th2.start();
		

}
	}
