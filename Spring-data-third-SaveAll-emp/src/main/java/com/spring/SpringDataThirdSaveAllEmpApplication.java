package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Dto.DTOimple;
import com.spring.controlll.FindEmps;

@SpringBootApplication
public class SpringDataThirdSaveAllEmpApplication {

	public static void main(String[] args) {
		ApplicationContext ct=SpringApplication.run(SpringDataThirdSaveAllEmpApplication.class, args);
	    FindEmps j=ct.getBean("ff",FindEmps.class);
	    List<DTOimple> k=new ArrayList<DTOimple>();
	    DTOimple o1=new DTOimple();
	    o1.setName("vishal");
	    o1.setAddress("khargone");
	    o1.setCity("indore");
	    o1.setSallary(4500);
	    o1.setDepIDl(4);
	    o1.setJob("CA");
	    k.add(o1);
	    
	    DTOimple a1=new DTOimple();
	    a1.setName("golu");
	    a1.setAddress("sanawad");
	    a1.setCity("badwah");
	    a1.setSallary(3200);
	    a1.setDepIDl(2);
	    a1.setJob("GO");
	    k.add(a1);
	    
	    DTOimple a2=new DTOimple();
	    a2.setName("shiva");
	    a2.setAddress("khandwa");
	    a2.setCity("desgaon");
	    a2.setSallary(9000);
	    a2.setDepIDl(9);
	    a2.setJob("SoftEE");
	    k.add(a2);
	    DTOimple a6=new DTOimple();
	    k.add(a6);
	    List<DTOimple> pl=j.findEmp(k);
	    System.out.println("this is save objects");
	    for(DTOimple s:pl)
	    {
	    System.out.println(s);
	    }
	    
	}

}
