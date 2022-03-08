import java.util.Vector;

import Studentvector.Student;

public class StudentMainClass {
	
	Vector<Object> v1= new  Vector<Object>();
	public void Studentdetails()
	{
		Student s1 =new Student("vj",01 ,9086654332l, "vj@gmail.com");
		Student s2 =new Student("sj",01 ,9086654333l, "sj@gmail.com");
		Student s3 =new Student("mj",01 ,9086654334l, "mj@gmail.com");
		Student s4 =new Student("pj",01 ,9086654338l, "pj@gmail.com");
	
	      v1.add(s1);
	      v1.add(s2);
	      v1.add(s3);
	      v1.add(s4);
	
	     for(int i=0; i<v1.size(); i++)
	{
		System.out.println(v1.get(i));
	}
}

	public static void main(String[] args) {
		StudentMainClass m1 =new StudentMainClass();
		m1.Studentdetails();
		// TODO Auto-generated method stub

	}

}
