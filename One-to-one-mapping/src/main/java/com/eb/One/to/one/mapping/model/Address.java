package com.eb.One.to.one.mapping.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
	@Entity
	@Table(name = "address")
	public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "zip_code")
	private String zipCode;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
}
