package com.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int studid;

@Column(name="firstname")	
	private String firstname;

@Column(name="lastname")		
	private String lastname;

@Column(name="age")		
	private int age;
}
