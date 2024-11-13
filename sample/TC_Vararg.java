package sample;

public class TC_Vararg {
	
	static void printdetails(String msg,int...numbers) {
		for(int i:numbers) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printdetails("hello",1,2,3,4,5);
		
	}

}
