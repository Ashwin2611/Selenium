package sample;

public class TC_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		String b[]=new String[2];
		for(int i=1;i<=5;i++) {
			a[i-1]=i;
		}
		b[0]="apple";
		b[1]="orange";
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
