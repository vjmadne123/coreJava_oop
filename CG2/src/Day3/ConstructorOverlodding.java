package Day3;

public class ConstructorOverlodding { //constructor Overloading
	public  ConstructorOverlodding()
	{
		System.out.println("zero arg");
	}
	public  ConstructorOverlodding(int a)
	{
		System.out.println("one with int arg");
	}
	public  ConstructorOverlodding(double b)
	{
		System.out.println("one with double arg");
	}
	public  ConstructorOverlodding(int a, double b)
	{
		System.out.println("two arg");
	}
	public  ConstructorOverlodding(double b, int a)
	{
		System.out.println("Order changed arg");
	}
	

	public static void main(String[] args) {
		new  ConstructorOverlodding();
		new  ConstructorOverlodding(10);
		new  ConstructorOverlodding(20.0);
		new  ConstructorOverlodding(10.2,20);
		
		
		
	}

}
