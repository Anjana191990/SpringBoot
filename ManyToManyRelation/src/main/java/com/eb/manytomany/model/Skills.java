package com.eb.manytomany.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "skill")
public class Skills {
@Override
	public String toString() {
		return "Skills [id=" + id + ", skillName=" + skillName + ", skillsScore=" + skillsScore + ", students="
				+ students + "]";
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "skill_name")
private String skillName;
@Column(name = "skill_score")
private String skillsScore;
@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "skills")
private Set<Student> students = new HashSet<>();

}
