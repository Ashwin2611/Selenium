package sample;

//interface only allow unimplemented methods
interface simplecalc{
	int add(int a,int b);
	int i=10;
}

class Clac implements simplecalc{
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
public class Tc_Interface {

	public static void main(String[] args) {
		simplecalc cl=new Clac();
		int a=cl.add(10,20);
		System.out.println(a);

	}

}
