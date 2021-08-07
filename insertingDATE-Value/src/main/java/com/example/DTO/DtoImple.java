package com.example.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class DtoImple implements Serializable {
	
	private Integer id;
	private String name;
	private String last;
	private LocalDate dob;
	private LocalDateTime tm;

}
