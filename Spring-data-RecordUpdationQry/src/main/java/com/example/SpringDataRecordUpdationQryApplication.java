package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Repo.RepoEMOP;

@SpringBootApplication
public class SpringDataRecordUpdationQryApplication {

	public static void main(String[] args) {
	ApplicationContext gst=SpringApplication.run(SpringDataRecordUpdationQryApplication.class, args);
	RepoEMOP sd=gst.getBean(RepoEMOP.class);
	int s=sd.insertingEmps(5000.0f);
	System.out.println(s);
	}

}
