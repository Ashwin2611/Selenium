package sample;

import java.util.ArrayList;

public class TC_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Apple");
		list.add("Orange");
		System.out.println("Size: "+list.size());
		
		System.out.println(list.contains("Hello"));
		
		System.out.println(list.get(2));
		
		System.out.println(list.remove(3));
		
		System.out.println("Size: "+list.size());
		
		System.out.println(list);
		
		System.out.println(list.removeAll(list));
		
		System.out.println(list);

		
	}

}
