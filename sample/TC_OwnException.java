package sample;
import java.util.*;
class AgeException extends Exception{
	private int age;
	public AgeException(int age) {
		super("Invalid age");
		this.age=age;
	}
	public String toString() {
		return age+" Invalid age";
	}
}

class Employee {
	String name;
	int age;
	
	void getdetails() throws AgeException {
		System.out.println("Enter you name:");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter age:");
		age=sc.nextInt();
		if(age<16) {
			throw new AgeException(age);
		}
		
	}
	
}
public class TC_OwnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			Employee emp=new Employee();
			emp.getdetails();
			System.out.print(emp.age+" Valid Age");
		}catch(AgeException e) {
			System.out.println("Age Exception :"+e.getMessage());
		}
	}

}
