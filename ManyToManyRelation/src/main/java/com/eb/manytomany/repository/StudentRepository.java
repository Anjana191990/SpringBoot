package com.eb.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.manytomany.model.Student;

public  interface StudentRepository extends JpaRepository<Student, Long> {

}
