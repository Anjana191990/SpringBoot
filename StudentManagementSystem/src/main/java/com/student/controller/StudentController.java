package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController

@RequestMapping(value = "student")
public class StudentController {

	@Autowired
	StudentService service;
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student s) {
	
		return service.createStudent(s);
		
	}
	@PutMapping(value = "/{id}")
	public Student updateStudent(@PathVariable ("id")int id,@RequestBody Student s) {
		s.setStudid(id);
		return service.updateStudent(s);
		
	}
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public List<Student> getAllStudent() 
	{
		return service.getAllStudent();
	}
	@DeleteMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public String deleteStudent (@PathVariable("id")int id) 
 
	{
		return service.deleteStudent(id);
		
	}
	@GetMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Student getStudentById(@PathVariable("id")int id)
	{
		return service.getStudentById(id);
		
	}
}

