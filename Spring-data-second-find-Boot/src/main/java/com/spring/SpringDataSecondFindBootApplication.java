package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Dto.DTOimple;
import com.spring.controlll.FindEmpControll;

@SpringBootApplication
public class SpringDataSecondFindBootApplication {

	public static void main(String[] args) {
		ApplicationContext ct=SpringApplication.run(SpringDataSecondFindBootApplication.class, args);
		FindEmpControll dd=ct.getBean("ff",FindEmpControll.class);
		DTOimple ko=dd.findEmp(8);
		if(ko.getId()>0)
		System.out.println(ko);
		else
			System.out.println("employee not found");

	}

}
