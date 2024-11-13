package sample;

import java.util.HashSet;

public class TC_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(100);
		set.add(400);
		
		System.out.println(set.size());
		System.out.println(set);
		
		for(int i : set) {
			System.out.println(i+" ");
		}
		
		HashSet<String> set2=new HashSet<String>();
		
		set2.add("B");
		set2.add("C");
		set2.add("A");
		
		for(String s:set2) {
			System.out.println(s);
		}
	}

}
