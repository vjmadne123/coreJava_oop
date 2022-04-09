package Day4;
class Demo{
	public static String empName= "";
	public static void emp(String name)
	{
		empName = name;
		
	}
}
public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 =new Demo();
		d1.emp("vjmadne");
		System.out.println(d1.empName);

	}

}
