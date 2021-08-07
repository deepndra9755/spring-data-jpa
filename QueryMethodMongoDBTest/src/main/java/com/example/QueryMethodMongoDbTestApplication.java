package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.IDGenrator.IDGenrator;
import com.example.dto.DTOimpl;
import com.example.service.IServiceImpl;

@SpringBootApplication
public class QueryMethodMongoDbTestApplication {

	public static void main(String[] args) {
	ApplicationContext cts=SpringApplication.run(QueryMethodMongoDbTestApplication.class, args);
	
	 IServiceImpl obj=cts.getBean("ss",IServiceImpl.class);
	 List<DTOimpl> dd=obj.GetEmps("sehwag");
	 for(DTOimpl s:dd)
	 {
		 System.out.println(s);
	 }
	 ((ConfigurableApplicationContext) cts).close();
	}

}
