package Day2;

class Demo{
	static int v1=20; //ststic -datamenber
	double v2=23.5; //non-static datamember
	public static void display()//static function
	{
		System.out.println("this demo class of display");
	}
	public void view()//non-static function
	{
		System.out.println("this demo class of view");
	}
	
}

public class AccessModifier {

	public static void main(String[] args) {
		System.out.println("v1: "+Demo.v1);
		System.out.println("v2: "+new Demo().v2);
		Demo.display(); //classname.membername
		new Demo().view();// New Obeject created classname.membername
		

		
	}

}
