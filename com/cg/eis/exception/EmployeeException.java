package com.cg.eis.exception;

public class EmployeeException extends Exception{
	public EmployeeException() {
		super("Employee Salary less than 3000");
	}
}
