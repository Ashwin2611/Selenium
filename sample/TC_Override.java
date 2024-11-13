package sample;

class Parent{
	void tv() {
		System.out.println("Parent tv");
	}
}

class child extends Parent{
	@Override
	void tv() {
		System.out.println("child tv");
	}
}

public class TC_Override {
	public static void main(String args[]) {
		child ch=new child();
		ch.tv();
	}
}
