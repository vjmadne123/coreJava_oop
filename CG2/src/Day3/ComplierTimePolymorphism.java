package Day3;
class Sample{
	public void display(char c)
	{
		System.out.println(c);
	}

	public void display(char c, int num) {
		System.out.println(c + " "+num);
	}

}
public class ComplierTimePolymorphism {
	
	public static void main(String[] args) {
		
				Sample s1 =new Sample();
				s1.display('a');
				s1.display('a', 50);

	}

}
