package Day35;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> hset = new LinkedHashSet<Object>();
		hset.add(10);
		hset.add("abc");
		hset.add(10);
		hset.add(54);
		hset.add(null);
		hset.add(null);
		Iterator<Object> itr = hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		
		

	}

}
