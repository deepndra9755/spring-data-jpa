package com.spring.controlll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Dto.DTOimple;
import com.spring.Service.CivilEmpFind;
@Component
@RestController
@RequestMapping("/con")
public class FindEmpControll implements FindEmps {
	@Autowired
	CivilEmpFind oo;
  
	@GetMapping("/see")
	public String Shw()
    {
    return "hello";	
    }
	@Override
	
	public List<DTOimple> findEmp(boolean s,String prop) {
		// TODO Auto-generated method stub
		System.out.println("Hello user");
		return oo.finder(s, prop);
	}


	
	
	

}
