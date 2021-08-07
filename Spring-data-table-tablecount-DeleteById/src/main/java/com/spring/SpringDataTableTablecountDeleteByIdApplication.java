package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.controlll.FindEmpControll;

@SpringBootApplication
public class SpringDataTableTablecountDeleteByIdApplication {

	public static void main(String[] args) {
		ApplicationContext ct=SpringApplication.run(SpringDataTableTablecountDeleteByIdApplication.class, args);
		FindEmpControll pd=ct.getBean("ff",FindEmpControll.class);
	   System.out.println( pd.findEmp(2));
	}

}
