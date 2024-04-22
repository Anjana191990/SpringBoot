package com.eb.manytomany.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity

@Table(name = "student")
public class Student {
@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", rollNo=" + rollNo + ", qualification="
				+ qualification + ", skills=" + skills + "]";
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "student_name")
private String studentName;
@Column(name = "roll_no")
private long rollNo;
@Column(name = "qualification")
private String qualification;
@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
@JoinTable(name = "student_skill",
joinColumns = {@JoinColumn(name="student_id")},
inverseJoinColumns = {@JoinColumn(name="skill_id")}
)
private Set<Skills> skills = new HashSet<Skills>();

}
