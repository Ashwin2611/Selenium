package sample;
import java.util.*;

abstract class Accounts{
	private String name;
	private int accnum;
	private int age;
	private int balance;
	public Accounts(String name,int age,int Balance,int accnum) {
		this.name=name;
		this.setAge(age);
		this.setBalance(Balance);
		this.accnum=accnum;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	abstract public boolean Withdraw(int amount);
}

class Saving extends Accounts{
	
	public Saving(String name,int age,int amount,int accnum) {
		super(name,age,amount,accnum);
	}
	final int MiniBalance=1000;
	@Override
	public boolean Withdraw(int amount) {
		if((getBalance()-amount)>=MiniBalance) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}


}

class Current extends Accounts{
	public Current(String name,int age,int amount,int accnum) {
		super(name,age,amount,accnum);
	}
	private int overdraft_limit=10000;
	
	public int getOverdraft() {
		return overdraft_limit;
	}
	@Override
	public boolean Withdraw(int WithdrawAmount) {
		if(WithdrawAmount>=overdraft_limit) {
			return false;
		}
		return true;
	}
}

public class Savings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Deposit Amount:");
		int amount=sc.nextInt();
		System.out.print("Withdraw Amount:");
		int WithdrawAmount=sc.nextInt();
		Saving save=new Saving("Ashwin",22,amount,112);
		Current cur=new Current("Ashwin",22,amount,112);
		System.out.println(save.getName()+" deposited Rupee:"+amount);
		boolean WithDraw=save.Withdraw(WithdrawAmount);
		if(WithDraw==true) {
			System.out.println("WithDraw Successful");
			System.out.println("Remaining Balance:"+save.getBalance());
		}else {
			System.out.println("Don't have sufficient Balance");
		}
		boolean over=cur.Withdraw(WithdrawAmount);
		if(over==false) {
			System.out.println("limit Reached");
		}else {
			System.out.println("You can Withdraw upto:"+(cur.getOverdraft()-WithdrawAmount));
		}
		
	}

}
