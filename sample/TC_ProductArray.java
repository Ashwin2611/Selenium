package sample;

import java.util.Arrays;

public class TC_ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prod[]=new String[5];
		prod[0]="bag";
		prod[1]="shirt";
		prod[2]="pant";
		prod[3]="tv";
		prod[4]="laptop";
		
		for(int i=0;i<prod.length;i++) {
			System.out.println(prod[i]);
		}
		
		Arrays.sort(prod);
		
		for(int i=0;i<prod.length;i++) {
			System.out.println(prod[i]);
		}
		
	}

}
