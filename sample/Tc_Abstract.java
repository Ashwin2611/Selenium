package sample;

//abstract class allow both implemented and unimplemented methods

abstract class shape{
	abstract void draw();
	abstract void painting();
}

class Rec extends shape{
	public void draw() {
		System.out.println("Rect drawing....");
	}
	void painting() {
		System.out.println("painted");
	}
	
}
public class Tc_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape r1=new Rec();
		r1.draw();
		r1.painting();
	}

}
