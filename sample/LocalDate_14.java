package sample;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
public class LocalDate_14 {
		public static void ZoneTimeDate(String ZoneIdsk)
		{
			ZonedDateTime Ctskparis=ZonedDateTime.now(ZoneId.of(ZoneIdsk));
			System.out.println("Current date of your referred time zone is: "+Ctskparis.getDayOfMonth());
			System.out.println("Current time of your refereed time zone is: "+Ctskparis.getHour()+":"+Ctskparis.getMinute()+":"+Ctskparis.getSecond());
		}
		public static void main(String args[])
		{
			Scanner sk=new Scanner(System.in);
			System.out.println("Enter Zone id: like America/Newyork");
			String ZoneIdsk=sk.nextLine();
			ZoneTimeDate(ZoneIdsk);

		}

}
