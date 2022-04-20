package Day28;

public class ThreadDemo1 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ThreadDemo1());
		t.start();
		System.out.println(t.getName());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" VIJAYLAXMI MADNE");
	}

}
