package sample;

import java.util.TreeSet;

public class TC_Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Q");
		set.add("A");
		set.add("D");
		set.add("M");
		set.add("R");
		
		for(String str : set) {
			System.out.println(str);
		}
		

	}

}
