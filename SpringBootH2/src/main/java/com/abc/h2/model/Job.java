package com.abc.h2.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "job")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String jobName;
	private String jobDescription;
	private String jobLocation;
	private String jobType;
}
