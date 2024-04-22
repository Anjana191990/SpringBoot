package com.eb.One.to.one.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.One.to.one.mapping.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
