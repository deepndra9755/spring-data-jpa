package com.example.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
public class FormRegister {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(length =20)
	private String name;
	@Column(length =20)
	
	private String last;
	
	private LocalDate dob;
	private LocalDateTime tm;
}
