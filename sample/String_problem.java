package sample;
import java.util.*;
public class String_problem {
	static String str;
	public String_problem(String str) {
		this.str=str;
	}
	public static void Display(String str) {
		System.out.println("Your String :"+str);
	}
	public static void Replace() {
		StringBuilder st=new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				st.setCharAt(i, '#');	
			}
		}
		System.out.println(st);
	}
	public static void removeDuplicates() {
		HashSet<Character> set =new HashSet();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character s: set) {
			System.out.print(s+" ");
		}
	}
	public static void UpperCase() {
		StringBuilder st=new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				st.toString().toUpperCase();
			}
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean st=true;
		while(st) {
			int n=sc.nextInt();
			switch(n){
			case 1:
//			System.out.println("Enter 1-To Enter String"+'\n'+"2-To Replace odd position with #");
//			System.out.println("Enter a String Value:");
				String Str=sc.next();
				String_problem strings=new String_problem(Str);
				Display(str);
				break;
			case 2:
				Replace();
				break;
			case 3:
				removeDuplicates();
				break;
			case 4:
				UpperCase();
				break;
			case 5:
				st=false;
				break;
			default:
				st=false;
				break;
			}
			
		}
			

	}

}
