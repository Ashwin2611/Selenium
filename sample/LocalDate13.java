package sample;
import java.time.LocalDate;
import java.util.Scanner;
public class LocalDate13 {
	public static void Expirycalculation(LocalDate purchaseddate,int wyear,int wmont)
	{
		LocalDate expiry=purchaseddate.plusYears(wyear).plusMonths(wmont);
		System.out.println("The warranty will expire on: "+expiry);
	}
	public static void main(String args[])
	{
		Scanner sk=new Scanner(System.in);
		LocalDate purchaseddate=LocalDate.parse(sk.nextLine());
		System.out.println("\n"+"Enter warranty years: ");
		int wyear=sk.nextInt();
		System.out.println("\n"+"Enter warranty months: ");
		int wmonth=sk.nextInt();
		Expirycalculation(purchaseddate,wyear,wmonth);

	}
}
