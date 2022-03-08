package Treeset1;

import java.util.Iterator;
import java.util.TreeSet;


public class Treeset3 {

	public static void main(String[] args) {
		TreeSet <Integer> set =new TreeSet<Integer>();
		
		set.add(10);
		set.add(5);
		set.add(4);
		set.add(6);
		set.add(9);
		set.add(11);
		set.add(15);
		set.add(14);
		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			
		
		System.out.println(itr.next());
		}
		
	
			
	}

}
