package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.entity.Employee;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);

	
	Employee e1=new Employee();
	
	e1.setEmpId(101);
	e1.setEmpName("Jhon Smith");
	System.out.println("Employee Id:"+e1.getEmpId()+"\nEmployee Name:"+e1.getEmpName());
	}
	


}
