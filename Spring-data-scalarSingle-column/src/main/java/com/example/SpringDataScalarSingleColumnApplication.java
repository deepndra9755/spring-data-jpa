package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Repo.RepoEMOP;

@SpringBootApplication
public class SpringDataScalarSingleColumnApplication {

	public static void main(String[] args) {
		ApplicationContext sr=SpringApplication.run(SpringDataScalarSingleColumnApplication.class, args);
		RepoEMOP f=sr.getBean(RepoEMOP.class);
		List<String> jn=f.findBySallary(500.0f);
		System.out.println(jn);
	 }

}
