package com.eb.One.to.one.mapping;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.eb.One.to.one.mapping.model.Address;
import com.eb.One.to.one.mapping.model.Employee;
import com.eb.One.to.one.mapping.repository.AddressRepository;
import com.eb.One.to.one.mapping.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OneToOneMappingApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		AddressRepository addressRepository = context.getBean(AddressRepository.class);
		// Save into db
		Address address = new Address();
		address.setZipCode("401105");
		address.setCountry("pune");
		address.setState("maharashtra");
		Employee employee = new Employee();
		employee.setEmpName("Amit");
		employee.setAddress(address);
		employeeRepository.save(employee);
		List<Employee> list = employeeRepository.findAll();
		System.out.println(list);
		Address addresses = addressRepository.findByZipCode("416115");
		System.out.println(addresses);
		}

}
