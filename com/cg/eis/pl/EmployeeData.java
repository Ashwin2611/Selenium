package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.*;
import com.cg.eis.service.*;
import java.util.*;
public class EmployeeData {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		try {
			EmployeeService EmpServ=new EmployeeSerimp();
			System.out.print("Employee Id:");
			int empid=sc.nextInt();
			System.out.print("Name:");
			String ename=sc.next();
			System.out.println("Salary:");
			double esalary=sc.nextDouble();
			System.out.println("Designation:");
			String edesign=sc.next();
			Employee emp=new Employee(empid,ename,esalary,edesign);
//		emp.displayEmployeeDetails();
			EmpServ.checkInsuranceScheme(emp);
			EmpServ.displayEmployeeDetails(emp);
		}catch(EmployeeException e) {
			System.out.print(e.getMessage());
		}
		
	}
}
