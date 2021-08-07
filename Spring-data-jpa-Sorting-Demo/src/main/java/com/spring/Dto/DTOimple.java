package com.spring.Dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import lombok.Data;
@Data
public class DTOimple {
	
	//id | name  | address    | city     | sallary | job  | DEPARTMENT | depIDl
	
	private int id;
	
	private String name;

	private String address;
	
	private String city;

	private float sallary;

	private String job;
	

	private int depIDl;
	
	

}

