package collectioninJava;

import java.util.LinkedList;

public class ListLinkedList {

	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		l.add(500);
		l.add("abcd");
		l.add('w');
		l.add(1030);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		
		//get size
		System.out.println(l.size());//6
		
		//printing value at particular index
		System.out.println(l.get(2));//w
		
		//set value at particular index
		l.set(1,"ashish"); //abcd==ashish
		System.out.println(l);
		
		//remove value from perticular index
		l.remove(4);
		System.out.println(l); // one null value is remove
		
		//to check value
		System.out.println(l.contains("xyz")); //false because this value is not in list
		
		//to check the value is empty or not
		
		System.out.println(l.isEmpty());//false
		
		//to delete records from the list
		l.clear();
		System.out.println(l);  //it clear all value from list
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
