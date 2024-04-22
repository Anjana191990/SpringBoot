package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	Student createStudent(Student s);
	Student updateStudent(Student s);
	List<Student>getAllStudent();
	Student getStudentById(int id);
	String deleteStudent(int id);
	
	
}
