package sample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TC_Throws {

	static void fileopen() throws FileNotFoundException{
		
			FileReader fd=new FileReader("test.txt");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fileopen();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
