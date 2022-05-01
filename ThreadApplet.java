package Day31;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ThreadApplet extends Applet{
	String message="This is vijayalaxmi.Madne";
	Thread thread1 =null;
	int status;
	boolean flag;
	public void init()
	{
		setBackground(Color.green);
		setBackground(Color.red);
		
	}
		public void run()
	{
		char c;
		for(; ;)
		{
			try
			{
				repaint();
				Thread.sleep(400);
				c=message.charAt(0);
				message=message.substring(1, message.length());
				message+=c;
				if(flag)
				{
					break;
				}
			}
			catch(Exception e)
			{
				
			}
		}
	}
	public void stop()
	{
		flag=true;
		thread1=null;
	}
	public void paint(Graphics g)
	{
		g.drawString(message, 50, 50);
	}


}
