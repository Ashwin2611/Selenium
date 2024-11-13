package sample;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class date_Time {

	public static void main(String args[])
	{
//		LocalDate accepteddate=LocalDate.of(2023, Month.OCTOBER, 1);
		Scanner sk=new Scanner(System.in);

		String accepteddateString=sk.nextLine();
		LocalDate accepteddate=LocalDate.parse(accepteddateString);
		LocalDate currentdate=LocalDate.now();
		Period finding=accepteddate.until(currentdate);
		System.out.println("Days Difference"+finding.get(ChronoUnit.DAYS));
		System.out.println("Month Difference"+finding.get(ChronoUnit.MONTHS));
		System.out.println("Years Difference:"+finding.get(ChronoUnit.YEARS));
	}

}
