package com.spring.controlll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.Dto.DTOimple;
import com.spring.Service.CivilEmpFind;
@Controller("ff")
public class FindEmpControll implements FindEmps {
	@Autowired
	CivilEmpFind oo;

	@Override
	public String findEmp(Integer j) {
		// TODO Auto-generated method stub
		return oo.finder(j);
	}
	
	

}
