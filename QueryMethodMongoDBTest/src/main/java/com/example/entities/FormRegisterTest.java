package com.example.entities;

import java.io.Serializable;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class FormRegisterTest implements Serializable{
@Id
private Integer id;
private Float sallary;
private String name;
private String jobTitle;
private String jobLocation;
private String jobDepartment;



}
