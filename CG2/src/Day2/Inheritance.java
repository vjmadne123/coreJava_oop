package Day2;

class Parent{
	final int v1=10; // final data member
	public final void Drinking() { //parent class
		
		System.out.println("Drinking Start...");
		
	}
	public void Scolding() {
		System.out.println("Scolding....");
	}
	
}
class Child extends Parent{  //child class
	double v2=20;
	public void lying() {
		System.out.println("lying start....");
	}
}


public class Inheritance {
	

	public static void main(String[] args) {
	Child c1 = new Child(); //child class Obeject
	
	c1.lying();
	c1.Scolding();
	c1.Drinking();
	System.out.println(c1.v1);
	System.out.println( c1.v2);
	System.out.println(c1.v1+c1.v2);
	

	}

}
