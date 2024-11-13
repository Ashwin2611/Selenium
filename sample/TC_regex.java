package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputstr="Apple";
		String pattern="Apple";
		boolean patternmatch=Pattern.matches(pattern,inputstr);
		System.out.println("Pattern match is:"+patternmatch);
		
		
		String input="Shop,Mop,Hopping,Chopping";
		Pattern p1=Pattern.compile("Hop");
		Matcher m1=p1.matcher(input);
		System.out.println(m1.matches());
		
		while(m1.find()) {
			System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
		}
		
		String input1="E3";
		Pattern p2=Pattern.compile("^[A-Z].*[0-9]$");
		Matcher m2=p2.matcher(input1);
		if(!m2.find()) {
			System.err.println("Enter the code which start with upper case alphabet and ends with a digit");
		}else {
			System.out.println("Found");
		}
		
		String email="ashwinmurugan818@gmail.com";
		Pattern p3=Pattern.compile("^[\\w_.]+@[\\w]+\\.[\\w.]{3,6}$");
		Matcher m3=p3.matcher(email);
		if(m3.find()) {
			System.out.println("Valid Email");
			System.out.println(m3.group()+":"+m3.start()+":"+m3.end());
		}else {
			System.out.println("Invalid Email");
		}
		//(//d-digit,//D-non-digit)
		String num="1234567890";//digit pattern
		Pattern p4=Pattern.compile("^\\d{10}$");
		Matcher m4=p4.matcher(num);
		if(m4.find()) {
			System.out.println("Mobile Number Matched");
		}else {
			System.out.println("Mobile Number Not Matched");
		}
		
		String num1="#####%%%%%";//Non-Digit
		Pattern p5=Pattern.compile("^\\D{10}$");
		Matcher m5=p5.matcher(num1);
		if(m5.find()) {
			System.out.println("Mobile Number Matched");
		}else {
			System.out.println("Mobile Number Not Matched");
		}
		//(//S-non-whitespace character)
		String in3="welcome ashwin";
		Pattern p6=Pattern.compile("\\S");
		Matcher m6=p6.matcher(in3);
		while(m6.find()) {
			System.out.println(m6.group()+" at position "+m6.start());
		}
		String in4="welcome ashwin hi";
		Pattern p7=Pattern.compile("^welcome.*hi$");
		Matcher m7=p7.matcher(in4);
		if(m7.find()) {
			System.out.println("matched");
		}else {
			System.out.println("no matched");
		}
		
	}

}
