package sample;
 

class AgeException1 extends Exception{
//	private int age;
	public AgeException1(int age) {
		super("Age "+ age +" is Invalid.");
//		this.age=age;
	}
	
}
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public Person(String name, int age) throws AgeException1 {
		super();
		this.name = name;
		this.age = age;
		if(age<16) {
//			System.out.println("in Method");
			throw new AgeException1(age);
		}
	}
}
 
 
class Account extends Person{
	private long accNum;
	private double balance;
	private Person accholder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccholder() {
		return accholder;
	}
	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}
	public static long generateAccNumber()
	{
		long number=(long)(Math.random()*1000000000000l);
		return number;
	}
	public Account(long accNum, double balance, Person accholder) throws AgeException1 {
		super(accholder.getName(),accholder.getAge());
		this.accNum = accNum;
		this.balance = balance;
		this.accholder = accholder;
	}
public void depositAmount(double amount) {
		double temp = balance;
		balance += amount;
		if((balance-temp)>=500) {
			System.out.println("amount deposited and maintaining sufficient balance");
		}
		else {
			System.out.println("amount deposited but maintain sufficient min balance of 500");
		}
	}
	public void withDrawAmount(double amount) {
		if((balance-amount)>500) {
			balance -=amount;
			System.out.println("amount withdrawn successfully with current balance : " + this.balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public String toString() {
		return "Account [accNumber=" + accNum + ", balance=" + balance + ", accHolder=" + accholder.getName() + ", " + accholder.getAge() +"]";
	}

}
public class BankAccount {
 
	public static void main(String args[])
	{
		try {
			Account Smith=new Account(Account.generateAccNumber(),2000,new Person("Smith",13));
			Account kathy=new Account(Account.generateAccNumber(),3000,new Person("Kathy",24));
			Smith.depositAmount(2000);
			System.out.println("Updated balance for smith: "+Smith.getBalance());
			kathy.withDrawAmount(3000);
			System.out.println("Updated balance for kathy: "+kathy.getBalance());
		}catch(AgeException1 e) {
			System.out.print(e.getMessage());
		}
	}
}