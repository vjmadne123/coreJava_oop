package Day11;

abstract class Sample{
	
	abstract public void test();
	
}
class Demo extends Sample{
	@Override
	public void test(){
		System.out.println("test() executed...");
		
	}
}
public class Abstract {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		d1.test();

	}

}
