package Day35;

import java.util.Collections;
import java.util.Vector;

public class ArrayListVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Vector<Integer> list =  new<Integer> Vector(15);
	  list.add(10);
		list.add(1);
		list.add(10);
		list.add(6);
		list.add(9);
		list.add(40);
		list.add(60);
		list.add(95);
		list.add(90);
		System.out.println(list);
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("_____________");
		System.out.println("first element of vector is =" +list.firstElement());
		System.out.println("last element of vector is =" +list.lastElement());
		Collections.sort(list);
		
		System.out.println("after sorting " +list);
		



	  
	  

	}

}
