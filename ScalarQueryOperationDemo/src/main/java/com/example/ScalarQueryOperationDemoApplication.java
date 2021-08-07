package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Repo.RepoEMOP;

@SpringBootApplication
public class ScalarQueryOperationDemoApplication {

	public static void main(String[] args) {
		ApplicationContext sts=SpringApplication.run(ScalarQueryOperationDemoApplication.class, args);
	    RepoEMOP ds=sts.getBean(RepoEMOP.class);
	    List<Object[]> dd=ds.findBySallary(3000,"d%","khargone");
	    for(Object[] d:dd)
	    {
	    System.out.println(d[0]+""+d[1]+""+d[2]+""+d[3]);	
	    }
	}

}
