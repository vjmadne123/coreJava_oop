package Day2;

class Add //Overloding Method
{
	public void drawPoint(int x, int y)
	{
		System.out.println(x+y);
	}
	protected void drawPoint(int x, double y) {
		System.out.println(x+y);
	}
	void drawPoint(double x, int y) {
		System.out.println(x+y);
	}
	void drawPoint(double x, double y) {
		System.out.println(x+y);
	}
}
public class Overloding {

	public static void main(String[] args) {
		Add a1 =new Add();
		a1.drawPoint(20,20);
		a1.drawPoint(10, 10.0);
		a1.drawPoint(23.5, 30);
		a1.drawPoint(12.3,4.12);

	}

}
