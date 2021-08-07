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
@Table(name ="civil")
public class Civil implements Serializable{
@Column(name ="id")
@Id
@GeneratedValue
private Integer id;
@Column(name ="name")
private String name;
 @Column(name="address")
private String address;
 @Column(name =" sallary") 
 private Float sallary;
 @Column(name ="city")
 private String city;
 @Column(name ="job")
 private String job;
 @Column(name ="DEPARTMENT")
 private String DEPARTMENT;
 @Column(name ="depIDl")
 private Integer depIDl;
 
 

}
