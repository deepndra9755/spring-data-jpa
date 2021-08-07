package com.example.DTO;

import javax.persistence.Column;

import lombok.Data;

@Data
public class DtoIMpl {

	private Integer id;

	private String name;

	private String last;
	
	private String school;
}
