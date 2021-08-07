package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.DTO.DtoImple;
import com.example.Repository.IRepoimpls;
import com.example.Service.Iservice;
import com.example.Service.IserviceImple;

@SpringBootApplication
public class InsertingDateValueApplication {
   
	
	public static void main(String[] args) {
		ApplicationContext ss=SpringApplication.run(InsertingDateValueApplication.class, args);
		IserviceImple js=ss.getBean("dd",IserviceImple.class);
		
		//this is for date insertion
		
		  
		  DtoImple s=new DtoImple(); s.setName("shivani"); s.setLast("singh");
		  s.setDob(LocalDate.now()); s.setTm(LocalDateTime.now());
		  if(js.insertingEmp(s)!=0) System.out.println("record inserted"); else
		  System.out.println("not inserted");
		 
		//this is for data retriving
		DtoImple sdd=js.insertingEmp("shivani");
		System.out.println(sdd);
	}

}
