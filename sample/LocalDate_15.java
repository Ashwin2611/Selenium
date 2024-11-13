package sample;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
 
class Person2{
	private String firstname2;
	private String lastname2;
	private char gender2;
	private long number2;
	private String dob;
	public Person2(String firstname2, String lastname2, char gender2,long number2,String dob) {
		super();
		this.firstname2 = firstname2;
		this.lastname2 = lastname2;
		this.gender2 = gender2;
		this.number2=number2;
		this.dob=dob;
	}
	public String getFirstname2() {
		return firstname2;
	}
	public void setFirstname2(String firstname2) {
		this.firstname2 = firstname2;
	}
	public String getLastname2() {
		return lastname2;
	}
	public void setLastname1(String lastname2) {
		this.lastname2 = lastname2;
	}
	public char getGender2() {
		return gender2;
	}
	public void setGender2(char gender2) {
		this.gender2 = gender2;
	}
	public long getNumber2() {
		return number2;
	}
	public void setNumber2(long number2) {
		this.number2 = number2;
	}
	public void personalDetails()
	{
		System.out.println("Personal Details:");
		System.out.println("First Name: "+firstname2);
		System.out.println("Last Name: "+lastname2);
		System.out.println("Gender: "+gender2);
		System.out.println("Number: "+number2);
	}
	public void calculateAge(String a)
	{
		LocalDate Agefind=LocalDate.parse(a);
		LocalDate currentDate=LocalDate.now();
		Period Agealmost=Agefind.until(currentDate);
		System.out.println("Age of "+firstname2+" is: "+Agealmost.getYears());
	}
	public  String getFullName()
	{
		return firstname2+" "+lastname2;
	}
 
	
}
public class LocalDate_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sk=new Scanner(System.in);
		String a=sk.nextLine();
		Person2 obj=new Person2("Ashwin","M",'M',8072516503L,a);
		obj.personalDetails();
		obj.calculateAge(a);
		System.out.println("Full name is: "+obj.getFullName());
 
	}

}
