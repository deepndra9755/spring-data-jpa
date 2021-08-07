package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Dto.DTOimple;
import com.spring.controlll.FindEmpControll;

@SpringBootApplication
public class SpringDataThirdFindAllEmpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDataThirdFindAllEmpApplication.class, args);
		FindEmpControll dd=ctx.getBean("ff",FindEmpControll.class);
		java.util.List<DTOimple> k=dd.findEmp(2);
		if(k.isEmpty())
		{
		System.out.println("this is empyt");	
		}
		else
		for(DTOimple ke:k)
		{
		System.out.println(ke);
		}
	}

}
