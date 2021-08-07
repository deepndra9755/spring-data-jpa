package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.DTO.DtoIMpl;
import com.example.service.IserviceImpl;

@SpringBootApplication
public class SpringDataFirstBootApplication {

	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(SpringDataFirstBootApplication.class, args);
		IserviceImpl jd=cts.getBean("ss",IserviceImpl.class);
		DtoIMpl po=new DtoIMpl();
		po.setName("kamal");
		po.setLast("kumar");
		po.setSchool("govt");
		int s=jd.employeeInsert(po);
		if(s==1)
		{
		System.out.println("this is value of id"+s);	
		}
		else
			System.out.println("problem"+s);
		
	    
	}

}
