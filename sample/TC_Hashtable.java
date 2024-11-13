package sample;

import java.util.Hashtable;

public class TC_Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,Double> ht=new Hashtable<String,Double>();
		ht.put("Arun",34.55);
		ht.put("Ram", 45.66);
		ht.put("Pooja", 4.95);
		ht.put("",0.00);
		
		System.out.println(30+"java"+30+40);
		System.out.println(ht.values());
		
		System.out.println(ht.keySet());
		

	}

}
