package com.example.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class DTOimpl {
	
	private Integer id;
	private List<Long> mobile;
	private LocalDate dob;
	private LocalDateTime dom;
	private Integer tell[];
	private Map<String,Float>resultDt;

}
