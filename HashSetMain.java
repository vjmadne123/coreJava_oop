package Day35;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(4);
		hs.add(15);
		hs.add(18);
		hs.add(19);
		hs.add(10);
		hs.add(1);
		hs.add(null);
		hs.add(null);
		hs.remove(19);
		System.out.println(hs);
		hs.forEach(emp->System.out.println(emp));
		for(Object obj:hs)
		{
			System.out.println(obj);
		}

		
		
		
				

	}

}
