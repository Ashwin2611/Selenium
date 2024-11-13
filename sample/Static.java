package sample;

public class Static {
	static int num1=3;
	static int num2;
	final int a;
	
	public Static() {
		System.out.println("Constructor");
		a=10;
		num2=7;
	}
	static {
		System.out.println("Static method initiaized");
		num2=1;
	}
	
	public static void Mymethod(int num3) {
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.out.println("Number3:"+num3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static st=new Static();
		Static st2=new Static();
		System.out.print(st.a+Static.num2);
	}

}
