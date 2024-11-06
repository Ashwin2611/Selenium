package com.opencart.utilities;

import java.util.Properties;

import java.io.*;

public class ReadConfig {
	static Properties prob;
	
	public ReadConfig() throws IOException{
		prob=new Properties();
		InputStream input=new FileInputStream("C:\\Users\\ashwin.murugan\\eclipse-workspace\\sample\\src\\test\\java\\com\\opencart\\testdata\\login.properties");
		prob.load(input);
	}
	public String getBrowserName() {
		String name=prob.getProperty("browser");
		System.out.println("browserName:"+name);
		return name;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
