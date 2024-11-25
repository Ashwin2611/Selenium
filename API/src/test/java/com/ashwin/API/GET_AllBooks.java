package com.ashwin.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class GET_AllBooks {
	
	@Test
	public void getAllBooks() {
		Response res=RestAssured.get("http://192.168.5.80:3000/api/v1/book/getAllBook");
		System.out.println("Status code:"+res.statusCode());
//		System.out.println("REsponsebody:"+res.getBody().asPrettyString());
		System.out.println("header content:"+res.contentType());
		System.out.println("Status line:"+res.getStatusLine());
//		System.out.print(res.getString("authorName[1]"));
		
	}
}
