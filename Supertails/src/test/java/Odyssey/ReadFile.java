package Odyssey;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
	public static String Prop(String url) throws IOException {
		  Properties prob=new Properties();
		  InputStream input=new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\Supertails\\Odyssey.properties");
		  prob.load(input);
		  String Openurl=prob.getProperty(url);
		  return Openurl;
	}
	
	public static XSSFSheet Excel() throws IOException {
		InputStream input=new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\Supertails\\Odyssey.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		return sheet;
	}
}
