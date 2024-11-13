package sample;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
 
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class localDate {

	public static void main(String args[])
	{
		Scanner sk= new Scanner(System.in);
		System.out.println("Enter first date in YYYY-MM-DD: ");
		LocalDate firstDate=LocalDate.parse(sk.nextLine());
		System.out.println("Enter second date in YYYY-MM-DD: ");
		LocalDate secondate=LocalDate.parse(sk.nextLine());
		Period periodsk=Period.between(firstDate, secondate);
		System.out.println("Years diff: "+periodsk.getYears()+"\n"+"Months difference: "+periodsk.getMonths()+"\n"+"Days difference: "+periodsk.getDays());
	}

}
