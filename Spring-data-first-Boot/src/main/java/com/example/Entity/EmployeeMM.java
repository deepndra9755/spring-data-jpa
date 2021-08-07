package com.example.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="EmployeeMM")
public class EmployeeMM implements Serializable{
@Column(name ="id")
@Id
@GeneratedValue
private Integer id;
@Column(name ="name")
private String name;
@Column(name ="last")
private String last;
@Column(name ="school")
private String school;

}
