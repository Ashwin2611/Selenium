package sample;

public class String_Concept {
	public static void main(String args[]) {
		String name= new String("ashwin");
		String name2=new String("Santhosh");
		String role="Developer";
		name="ashw";
		System.out.print(name);
		System.out.println("String length"+name2.length());
		System.out.println("Character index:"+name2.indexOf("h"));
		System.out.println("Substring:"+name2.substring(0,3));
		System.out.println("value of"+name2.valueOf(30));
		System.out.println("Empty:"+name2.isEmpty());
		System.out.println("Concat:"+name.concat(role));
		System.out.println("Equals:"+name.equals(name));
		
		StringBuilder str=new StringBuilder();
		str.append("ashwin");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		
		StringBuffer strbuf=new StringBuffer();
		strbuf.append("santhosh");
		System.out.println(strbuf.reverse());
		
	}
}
