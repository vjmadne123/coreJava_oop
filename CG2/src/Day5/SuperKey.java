package Day5;
class Android {
	static int a; //global variable
	
	public void Homescreen() {
		int a=7;//local variable
		System.out.println("Homescreen() in Anddroid class");
		System.out.println(a);//localvariable calling method
	System.out.println(Android.a);// global variable calling method
	}
}
class samsung extends Android{
	@Override
	public void Homescreen() {
		super.Homescreen();// superkey
		System.out.println("car Image");
	}
}
	
class Oneplus extends Android
{
	@Override
	public void Homescreen() {
		super.Homescreen(); // superkey
		System.out.println("Bike Image");
	}

	
}
class realme extends Android{
	public void Homescreen() {
		super.Homescreen();
		System.out.println("Scoty Image");
	}

}
public class SuperKey {

	public static void main(String[] args) {
		Android a1 = new Android();
		a1.Homescreen();
		samsung s1= new samsung();
		s1.Homescreen();
		Oneplus o1 = new Oneplus();
		o1.Homescreen();
		realme  r1 = new realme();
		r1.Homescreen();
		// TODO Auto-generated method stub

	}

}
