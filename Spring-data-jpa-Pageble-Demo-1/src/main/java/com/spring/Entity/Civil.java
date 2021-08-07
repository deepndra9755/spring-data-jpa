package com.spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="civil")
public class Civil {
	
	//id | name  | address    | city     | sallary | job  | DEPARTMENT | depIDl
	@Column(name ="id")
	@GeneratedValue
	@Id
	private int id;
	@Column(name ="name")
	private String name;
	@Column(name ="address")
	private String address;
	@Column(name ="city")
	private String city;
	@Column(name ="sallary")
	private float sallary;
	@Column(name ="job")
	private String job;
	@Column(name ="DEPARTMENT")
	private String DEPARTMENT;
	@Column(name ="depIDl")
	private int depIDl;
	
	

}
