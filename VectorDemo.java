package Day34;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		String s1= new String("viju");
		String s2= new String("viju");
		Employee e1=new Employee(1, "viju", 100000);
		Employee e2=new Employee(1, "viju", 100000);
		v1.add(s1);
		v2.add(e2);
		System.out.println(v1.contains(s2));
		System.out.println(v2.contains(e2));
	}
	

}
