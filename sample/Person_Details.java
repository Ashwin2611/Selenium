package sample;

public class Person_Details {
	String FirstName;
	String LastName;
	char Gender;
	int Age;
	double Weight;
	public Person_Details(String FirstName,String LastName,char Gender,int Age,double Weight) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Gender=Gender;
		this.Age=Age;
		this.Weight=Weight;
	}
	public void display() {
		System.out.print("First Name:"+FirstName+'\n'+"Last Name:"+LastName+'\n'+"Gender:"+Gender+'\n'+"Age"+Age+'\n'+"Weight:"+Weight);
	}                

	public static void main(String args[]) {
		new Person_Details("Ashwin","Murugan",'M',21,57.5).display();
		  
	}
}
