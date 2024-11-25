package StepDefinition;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class BooksStepDef {   
	Response res;
	JSONObject json;
	String Api;
	@Given("Enter the post url")    
	public void enter_the_post_url() {        
		// Write code here that turns the phrase above into concrete actions 
		 json=new JSONObject();
		 Api="http://192.168.5.80:3000/api/v1/book/addBook";
//		throw new io.cucumber.java.PendingException();    
		}    
	@Given("enter the book details")    
	public void enter_the_book_details() {        
		// Write code here that turns the phrase above into concrete actions   
		json.put("name", "Marvel");
		json.put("authorName", "Junior");
		json.put("publishedYear", "11/12/1999");
		json.put("price", 2500);

//		throw new io.cucumber.java.PendingException();    
		}    
	@When("post the book details")    
	public void post_the_book_details() {    
		res=RestAssured.given().contentType(ContentType.JSON).body(json.toJSONString()).post(Api);
		System.out.println("POST:"+res.getBody().asPrettyString());
		// Write code here that turns the phrase above into concrete actions     
//		throw new io.cucumber.java.PendingException();    
		}    
	@Then("validate the book name")    
	public void validate_the_book_name() {    
		
		// Write code here that turns the phrase above into concrete actions        
//		throw new io.cucumber.java.PendingException();    
		}    
	@Then("validate the price")    
	public void validate_the_price() {        
		// Write code here that turns the phrase above into concrete actions        
//		throw new io.cucumber.java.PendingException();    
		}    
	@Then("Validate the Author")    
	public void validate_the_author() {        
		// Write code here that turns the phrase above into concrete actions        
		throw new io.cucumber.java.PendingException();    
		}    
	@Given("Enter the url")    
	public void enter_the_url() {        
		// Write code here that turns the phrase above into concrete actions        
		throw new io.cucumber.java.PendingException();    
		}    
	@When("get the book details")    
	public void get_the_book_details() {        
		// Write code here that turns the phrase above into concrete actions        
//		throw new io.cucumber.java.PendingException();    
		}    
	@Then("validate the status code")    
	public void validate_the_status_code() {        
		// Write code here that turns the phrase above into concrete actions        
//		throw new io.cucumber.java.PendingException();    
		}   
	@Given("enter updated book details")    
	public void enter_updated_book_details() {        
		// Write code here that turns the phrase above into concrete actions        
//		throw new io.cucumber.java.PendingException();    
		}    
	@When("put the book details")    
	public void put_the_book_details() {        
		// Write code here that turns the phrase above into concrete actions        
//		throw new io.cucumber.java.PendingException();    
		}    
	@When("patch the book details")    
	public void patch_the_book_details() {       
		// Write code here that turns the phrase above into concrete actions        
//		throw new io.cucumber.java.PendingException();    
		}
	} 
	
