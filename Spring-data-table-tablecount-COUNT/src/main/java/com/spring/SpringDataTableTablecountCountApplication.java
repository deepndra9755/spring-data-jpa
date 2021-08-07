package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Entity.EmployeeDetails;
import com.spring.Service.TabImpl;

@SpringBootApplication
public class SpringDataTableTablecountCountApplication {

	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(SpringDataTableTablecountCountApplication.class, args);
		TabImpl jf=cts.getBean("sr",TabImpl.class);
		System.out.println("SpringDataTableTablecountCountApplication.main() count "+jf.counter());
	     
	}

}
