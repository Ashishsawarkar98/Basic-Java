package collectioninJava;

import java.util.ArrayList;

public class ListArrayList {

	public static void main(String[] args) {
	
		ArrayList a =new ArrayList();
		
		a.add(100);
		a.add("abc");
		a.add('d');
		a.add(null);
		
		
		System.out.println(a);
		
		//get size
		System.out.println(a.size());//5(size start from 1)
		
		//for particular index
		System.out.println(a.get(2));//d (index start from zero)
		
		//set value at particular index
		a.set(1, "xyz");
		System.out.println(a);// abc==xyz
		
		// remove a value from a perticular index
		a.remove(4);
		System.out.println(a);
		
		// to check the value
		
		System.out.println(a.contains("xyz"));
		
		//to check it is empty or not
		
		System.out.println(a.isEmpty());
		
		//delete all records
		a.clear();
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
