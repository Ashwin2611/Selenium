package sample;
import java.util.*;
public class TC003_while {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int j=4;
		while(j!=0) {
			System.out.println(j);
			j--;
		}
		j=4;
		System.out.println();
		do {
			System.out.println(j);
			j--;
		}while(j!=0);
		
		if(num>=0) {
			System.out.println("Positive");
		}else {
			System.out.println("Negative");
		}
	}
	
	
	
}
