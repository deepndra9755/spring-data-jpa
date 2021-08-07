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
	public List<DTOimple> findEmp(List<DTOimple> k) {
		// TODO Auto-generated method stub
		for(DTOimple d:k)
		{
		System.out.println("getter controller");
		System.out.println(d);	
		}
		System.out.println("this is getter data"+k);
		return oo.finder(k);
	}

	
	
	

}
