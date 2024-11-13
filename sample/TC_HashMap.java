package sample;
import java.util.HashMap;
import java.util.Map;

public class TC_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("101", "Keerthi");
		map.put("102","Santhosh");
		map.put("103","Vijay");
		map.put("104", "Pratham");
		map.put("105","Ashwin");
		
		System.out.println(map.get("101"));
		
		System.out.println(map.values());
		
		for(Map.Entry<String,String> m:map.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
	}

}
