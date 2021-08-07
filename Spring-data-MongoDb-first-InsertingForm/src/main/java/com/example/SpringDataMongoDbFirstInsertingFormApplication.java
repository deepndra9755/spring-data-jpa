package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.IDGenrator.IDGenrator;
import com.example.dto.DTOimpl;
import com.example.service.IServiceImpl;

@SpringBootApplication
public class SpringDataMongoDbFirstInsertingFormApplication {

	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(SpringDataMongoDbFirstInsertingFormApplication.class, args);
	    
		 IServiceImpl obj=cts.getBean("ss",IServiceImpl.class);
		 DTOimpl os=new DTOimpl();
		 os.setId(new IDGenrator().getids());
		 os.setSallary(30000.0f);
		 os.setName("mukesh");
		 os.setJobTitle("self-startup");
		 os.setJobLocation("badwani");
		 
		 
		 System.out.println("SpringDataMongoDbFirstInsertingFormApplication.main() and this is your id "+obj.GetForm(os));
		 ((ConfigurableApplicationContext) cts).close();
	}

}
	