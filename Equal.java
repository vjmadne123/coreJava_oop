package Day26;
 class Ab{
	 int i;
	 String s;
	 static int j;
	 public Ab(int i, String s) {
		 this.i=i;
		 this.s=s;
	 }
 }
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab a = new Ab(10, "Vjmadne");
		a.i=12;
		Ab.j=12;
		Ab b1=a;
		if(a ==null)
			System.out.println("True");
		else 
			System.out.println("False");
		Ab b2 = new Ab(10, "Vjmadne");
		if(a ==b1)//equal
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a ==b2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(b2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		
		

	}

}
