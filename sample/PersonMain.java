package sample;
import java.util.*;

class NameException extends Exception{

	public NameException() {
		super("Name field is Blanck.Please Fill your FirstName and LastName");
	}
}
public class PersonMain {
	private String FirstName;
	private String LastName;
	private Gen Gender;
	private long phoneNo;
	
	static enum Gen{
		M,F;
	}
	 
	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	private void setFirstName(String FirstName) throws NameException{
		this.FirstName=FirstName;
		if(FirstName.isEmpty()) {
			throw new NameException();
		}
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	private void setLastName(String LastName) throws NameException {
		this.LastName=LastName;
		if(LastName.isEmpty()) {
			throw new NameException();
		}
	}
	
	public String getLastName() {
		return LastName;
	}
	
	private void setGender(Gen Gender) {
		this.Gender=Gender;
	}
	
	public Gen getGender() {
		return Gender;
	}
	
	public void display(String FirstName,String LastName,Gen Gender,long Phone) {
		System.out.print("FirstName:"+FirstName+'\n'+"LastName:"+LastName+'\n'+"Gender:"+Gender+'\n'+"Phone:"+Phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the FirstName");
			PersonMain person=new PersonMain();
			String fname=sc.nextLine();
			System.out.println("Enter the LastName");
			String lname=sc.nextLine();
//		char g=sc.next().charAt(0);
			long ph=sc.nextLong();
			person.setFirstName(fname);
			String FirstName=person.getFirstName();
			person.setLastName(lname);
			String LastName=person.getLastName();
			person.setGender(PersonMain.Gen.M);
			Gen Gender=person.getGender();
			person.setPhoneNo(ph);
			long Phone=person.getPhoneNo();
			person.display(FirstName,LastName,Gender,Phone);
			
		}catch(NameException e) {
			System.out.println(e.getMessage());
		}
	}

}
