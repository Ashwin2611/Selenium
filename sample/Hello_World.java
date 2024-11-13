package sample;
import java.util.*;
import Pack1.*;
import Pack2.*;

class santhosh {
	String name="Santhosh";
	int number=123;
	int count=0;
	static int days=0;
	public void Emp() {
		int empid=2450;
		System.out.println(empid);
	}
}
class San extends Pack1.Student{
}
public class Hello_World {
	
	public static void name() {
		System.out.println("ashwin");
	}
	public static void main(String args[])
	{
		santhosh san=new santhosh();
		san.count++;
		santhosh.days++;
		san.count++;
		santhosh.days++;
		santhosh san1=new santhosh();
		san1.count++;
		santhosh.days++;
		System.out.println("Instance of san:"+san.count+ " Instance of san1:"+san1.count+" static of class santhosh:"+santhosh.days);
		
		ArrayList<Integer> list= new ArrayList();
		for(int i=0;i<=5;i++) {
			list.add(i);
		}
//		Hello_World h=new Hello_World();
		name();
		
		san.Emp();
//		Pack1.Student.Name();
		San s=new San();
		s.Name();
	}
}
