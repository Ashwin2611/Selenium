package Excel;
import java.io.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
//import org.junit.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class APIExcel {
	Response res;
	XSSFSheet sheet;
	@Test
	public void addExcel() throws IOException {
		InputStream input=new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\API\\API Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		sheet=workbook.getSheet("API");
		for(Row row : sheet) {
			String method=row.getCell(0).getStringCellValue();
			String Api=row.getCell(1).getStringCellValue();
			if(method.equals("GET")) {
				getMethod(Api);
			}
			else if(method.equals("POST")) {
				postMethod(Api);
			}else if(method.equals("PATCH")) {
				patchMethod(Api);
			}else if(method.equals("DELETE")) {
				deleteMethod(Api);
			}
		}
		
	}
	
	public void getMethod(String Api) {
//		JSONObject obj=new JSONObject();
		res=RestAssured.get(Api).andReturn();
		System.out.println(res.asPrettyString());
	}
	
	public void postMethod(String Api) {
		JSONObject jsonobj=new JSONObject();
		System.out.println("ashwin");
		jsonobj.put("name", sheet.getRow(3).getCell(2).getStringCellValue());
		jsonobj.put("authorName",sheet.getRow(3).getCell(3).getStringCellValue());
		jsonobj.put("publishedYear",sheet.getRow(3).getCell(4).getLocalDateTimeCellValue().toString());
		jsonobj.put("price",sheet.getRow(3).getCell(5).getNumericCellValue());
		System.out.println(jsonobj.toJSONString());
		res=RestAssured.given().contentType(ContentType.JSON).body(jsonobj.toJSONString()).post(Api);
		System.out.println("Post:"+res.getBody().asPrettyString());
	}
	
	public void patchMethod(String Api) {
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("publishedYear",sheet.getRow(4).getCell(4).getLocalDateTimeCellValue().toString());
		res=RestAssured.given().contentType(ContentType.JSON).body(jsonobj.toJSONString()).patch(Api);
		System.out.println("Patch:"+res.getBody().asPrettyString());
	}
	
	public void deleteMethod(String Api) {
		res=RestAssured.given().contentType(ContentType.JSON).delete(Api);
		System.out.println("DELETE:"+res.getBody().asPrettyString());
	}
}
