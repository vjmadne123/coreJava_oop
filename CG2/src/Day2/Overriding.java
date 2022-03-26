package Day2;

class Amazon{ //Overrding 
	public void LogIn() {
		System.out.println("Login Id");
	}
	public void LogOut() {
		System.out.println("LogOut id");
	}
}
class Filpcart extends Amazon{
	@Override
	public void LogIn() {
		super.LogIn();      //Super()
	}
	public void LogOut() {
		super.LogOut();
		System.out.println("LogOut ");
	}
	
}
public class Overriding {

	public static void main(String[] args) {
		Filpcart f1 = new Filpcart();
		f1.LogIn();
		f1.LogOut();
		
	
	}

}
