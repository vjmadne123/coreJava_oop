package Day4;
class Foo{
	String name = " ";
	public void geek(String name) {
		this.name=name;
		
	}
}
public class InstanceMethod {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo ob = new Foo();
		ob.geek("Hello Good morning");
		System.out.println(ob.name);

	}

}
