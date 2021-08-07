package com.example.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class FormRegisterTest implements Serializable{
@Id
private Integer id;
private List<Long> mobile;
private LocalDate dob;
private LocalDateTime dom;
private Integer tell[];
private Map<String,Float>resultDt;
}
