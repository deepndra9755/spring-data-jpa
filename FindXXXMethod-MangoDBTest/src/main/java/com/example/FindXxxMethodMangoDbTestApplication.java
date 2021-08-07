package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dto.DTOimpl;
import com.example.service.IServiceImpl;

@SpringBootApplication
public class FindXxxMethodMangoDbTestApplication {

	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(FindXxxMethodMangoDbTestApplication.class, args);
		IServiceImpl ss=cts.getBean("ss",IServiceImpl.class);
		List<DTOimpl> js=ss.GetForm("indore");
		
		for(DTOimpl d:js)
		{
		System.out.println(d);	
		}
		((ConfigurableApplicationContext) cts).close();
	}

}
