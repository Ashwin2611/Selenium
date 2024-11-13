package sample;

public class TC_execption {

	public static void main(String[] args) {
		try {
			String str=null;
			str.equals("hello");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
		
		
		try {
			int a=0;
			int b=30/0;
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

}
