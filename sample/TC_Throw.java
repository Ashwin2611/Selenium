package sample;

import java.io.FileNotFoundException;

public class TC_Throw {
	
	void prog() {
		try {
//			int i=10/0;
			throw new FileNotFoundException("From Exception");
		}catch(FileNotFoundException e) {
			System.out.println("Caught inside the demo");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		TC_OwnException obj=new TC_OwnException();
		try {
			obj.prog();
		}catch(Exception e) {
			System.out.println("Recaught:"+e.getMessage());
		}

	}

}
