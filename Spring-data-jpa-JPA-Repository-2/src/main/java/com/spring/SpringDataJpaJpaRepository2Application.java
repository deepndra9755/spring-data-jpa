package com.spring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Entity.Civil;
import com.spring.Repos.ReposDemoi;

@SpringBootApplication
public class SpringDataJpaJpaRepository2Application {

	public static void main(String[] args) {
		ApplicationContext tsx=SpringApplication.run(SpringDataJpaJpaRepository2Application.class, args);
	   
		ReposDemoi jd=tsx.getBean(ReposDemoi.class);
		//Civil hsd=jd.findByName("piyush");
		//List<Civil>hj=jd.findBycityIsNotNull();
		jd.findByNameStartsWith("d");
//		for(Civil d:hj)
//		{
//			System.out.println(d);
//		
//		}
		}

}
