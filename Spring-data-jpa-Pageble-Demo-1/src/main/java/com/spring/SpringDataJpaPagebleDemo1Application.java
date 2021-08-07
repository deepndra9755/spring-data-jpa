package com.spring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Dto.DTOimple;
import com.spring.controlll.FindEmpControll;

@SpringBootApplication
public class SpringDataJpaPagebleDemo1Application {

	public static void main(String[] args) {
		ApplicationContext xc=SpringApplication.run(SpringDataJpaPagebleDemo1Application.class, args);
		FindEmpControll dsd=xc.getBean("ff",FindEmpControll.class);
		List<DTOimple> d=dsd.findEmp(true,"id");
		for(DTOimple dss:d)
		{
		System.out.println(dss);	
		}
	}

}
