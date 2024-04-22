package com.post.entity;

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
@Table(name="POST_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class 
Post {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int postId;
	@Column(name="postName")
	private String postName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="published")
	private boolean published;
}
