package com.eb.One.to.one.mapping.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "emp")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "emp_name")
private String empName;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "address_id",referencedColumnName = "id")
private Address address;
}
