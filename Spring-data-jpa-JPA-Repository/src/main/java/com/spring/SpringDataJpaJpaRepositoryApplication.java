package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Dto.DTOimple;
import com.spring.controlll.FindEmpControll;

@SpringBootApplication
public class SpringDataJpaJpaRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(SpringDataJpaJpaRepositoryApplication.class, args);
		FindEmpControll hs=cts.getBean("ff",FindEmpControll.class);
	   
		List<DTOimple> hd=hs.findEmp();
		for(DTOimple s:hd)
		{
			System.out.println(s);
		}
		
//		try
//		{
//		//hs.findEmp(true,"");
//			DTOimple jd=new DTOimple();
//			jd.setId(47);
//			List<DTOimple> hd=new ArrayList<DTOimple>();
//			hs.findEmp(hd);
//		System.out.println("record deleted");
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("no record");
//		}
		}

}
