package com.cg.eis.service;
import com.cg.eis.bean.*;
public class EmployeeSerimp implements EmployeeService {
	@Override
	public void checkInsuranceScheme(Employee emp) {
		System.out.println(emp.getInsuranceScheme());
	}
	@Override
	public void displayEmployeeDetails(Employee emp) {
		System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Employee Designation: " + emp.getDesignation());
        System.out.println("Employee Insurance Scheme: " + emp.getInsuranceScheme());
	}

}
