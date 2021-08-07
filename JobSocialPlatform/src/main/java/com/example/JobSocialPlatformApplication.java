package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.DTO.DtoImple;
import com.example.Service.IserviceImple;

@SpringBootApplication
public class JobSocialPlatformApplication {

	public static void main(String[] args) {
		System.out.println(" enter location");
		ApplicationContext ss=SpringApplication.run(JobSocialPlatformApplication.class, args);
        IserviceImple js=ss.getBean("dd",IserviceImple.class);
		
		//this is for date insertion
		
		  
		  DtoImple s=new DtoImple(); s.setName("shivani"); s.setLast("singh");
		  s.setDob(LocalDate.now()); s.setTm(LocalDateTime.now());
		   
		   Scanner sc=new Scanner(System.in);
		   String loc=sc.next();
		  InputStream iss;
		try {
			iss = new FileInputStream(loc);
			 byte b[]=new byte[iss.available()];
			  iss.read(b);
			  s.setImage(iss);
			  js.insertingEmp(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
