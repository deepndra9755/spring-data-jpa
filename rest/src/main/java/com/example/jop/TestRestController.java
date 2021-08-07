package com.example.jop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
@ComponentScan
public class TestRestController {

	@GetMapping("/show")
	public String testGetRest() {
		System.out.println("hello");
		return "Hello";
	}
	
	@PostMapping("/add")
	public String testPostRest(@RequestBody String str) {
		System.out.println("post service");
		return str;
	}
}
