package com.spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="sallac")
public class EmployeeDetails {
	// ID | NAME | LAST | SALL | POST
	@Column(name = "ID")
	@GeneratedValue
	@Id
	private Integer id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LAST")
	private String Last;
	@Column(name = "SALL")
	private Float SALL;
	@Column(name = "POST")
	private String POST;
}
