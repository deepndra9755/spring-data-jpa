package com.spring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Dto.DTOimple;
import com.spring.controlll.FindEmpControll;

@SpringBootApplication
public class SpringDataJpaSortingDemoApplication {

	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(SpringDataJpaSortingDemoApplication.class, args);
		FindEmpControll op=cts.getBean("ff", FindEmpControll.class);
	   List<DTOimple> jd= op.findEmp(true,"id");
	   for(DTOimple jdd:jd)
	   {
		 System.out.println(jdd);  
	   }
	}

}
