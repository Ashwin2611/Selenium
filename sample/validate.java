package sample;
import java.util.*;
public class validate {

	public static boolean validity(String str){
		for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
	}
	public static void main(String args[])
	{
		Scanner sk=new Scanner(System.in);
		String a=sk.nextLine();
		if(validity(a))
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
	}

}
