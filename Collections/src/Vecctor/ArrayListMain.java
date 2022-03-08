package Vecctor;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ArrayListMain {

	public static void main(String[] args) {
		Vector<Integer>List = new Vector<Integer>(15);
		List.add(10);
		List.add(1);
		List.add(10);
		List.add(6);
		List.add(9);
		List.add(40);
		List.add(60);
		List.add(95);
		List.add(90);
		
		System.out.println(List);
		for(int i=0; i<List.size(); i++)
		{
			System.out.println(List.get(i));
			
		}
		System.out.println("___________________");
		System.out.println("firstElement of vector is= " + List.firstElement());
		System.out.println("lastElement of vector is= " + List.lastElement());
	    Collections.sort(List);
		System.out.println("after sorting" +List);
	}
		
		
		
		
		// TODO Auto-generated method stub

	}


