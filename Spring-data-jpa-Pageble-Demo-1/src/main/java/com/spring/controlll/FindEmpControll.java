package com.spring.controlll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.Dto.DTOimple;
import com.spring.Service.CivilEmpFind;
@Controller("ff")
public class FindEmpControll implements FindEmps {
	@Autowired
	CivilEmpFind oo;

	@Override
	public List<DTOimple> findEmp(boolean s, String prop) {
		// TODO Auto-generated method stub
		return oo.finder(s, prop);
	}


	
	
	

}
