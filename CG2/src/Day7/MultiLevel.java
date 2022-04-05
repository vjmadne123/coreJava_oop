package Day7;
class WhatsApp1
{
	public void textmsg() {
		System.out.println("test msg() executed..");
	}
}
class WhatsApp2 extends WhatsApp1{
	public void  voicemsg() {
		System.out.println("Voicemsg() extected....");
		
	}
}
class WhatsApp3 extends WhatsApp2{
	public void videocall() {
		System.out.println("video call() executed....");
	}
	
	
}
public class MultiLevel {

	public static void main(String[] args) {
		WhatsApp1 w1 = new WhatsApp1();
		w1.textmsg();
		WhatsApp2 w2 = new WhatsApp2();
		w2.textmsg();
		w2.voicemsg();
		
		WhatsApp3 w3 = new WhatsApp3();
		w3.textmsg();
		w3.voicemsg();
		w3.videocall();
		
		// TODO Auto-generated method stub

	}

}
