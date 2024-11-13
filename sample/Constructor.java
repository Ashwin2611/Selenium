package sample;

public class Constructor {
	int a;
	int b;
	public Constructor(int a,int b) {
		this.a=a;
		this.b=b;	
	}
	public void add() {
		System.out.print("Addition "+(a+b));
	}
}
