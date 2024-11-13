package sample;

public class TC_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int res=10/ ;
			int[] num= {1,2,3};
			System.out.println(num[5]);
			
			String str=null;
			System.out.println(str.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic error:"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("IndexOutofBound:"+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer:"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("unexcepted Error:"+e.getMessage());
		}
		finally {
			System.out.println("finaly Block");
		}

	}

}
