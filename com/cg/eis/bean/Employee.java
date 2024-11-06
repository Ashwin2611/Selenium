package com.cg.eis.bean;
import com.cg.eis.exception.*;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee(int id,String name,double salary,String designation) throws EmployeeException {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.insuranceScheme=desig(designation);
		if(salary<3000) {
        	throw new EmployeeException();
        }
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	 public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	        
	    }

	    public String getDesignation() {
	        return designation;
	    }

	    public void setDesignation(String designation) {
	        this.designation = designation;
	        desig(designation);
	    }

	    public String getInsuranceScheme() {
	        return insuranceScheme;
	    }
	    
//	    public void setInsuranceScheme() {
//	    	this.insuranceScheme=desig(designation);
//	    }
	    
	    public String desig(String designation) {
	    	if(designation.equals("Manager")) {
	    		return this.insuranceScheme="Scheme 1";
	    	}
	    	else if(designation.equals("Team Lead")) {
	    		return this.insuranceScheme="Scheme 2";
	    	}
	    	else if(designation.equals("Developer")) {
	    		return this.insuranceScheme="Scheme 3";
	    	}
	    	else {
	    		return this.insuranceScheme="No Scheme";
	    	}
	    }
	    
	

}
