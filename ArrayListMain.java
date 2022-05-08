package Day35;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>(15);
		list.add(10);
		list.add("ABC");
		list.add(10);
		list.add(null);
		list.add(9);
		list.add(null);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(1));


		}

}
