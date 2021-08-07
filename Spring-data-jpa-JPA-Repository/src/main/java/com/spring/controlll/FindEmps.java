package com.spring.controlll;

import java.util.List;

import com.spring.Dto.DTOimple;

public interface FindEmps {
	

	public void findEmp(boolean s,String prop);
	
	public List<DTOimple> findEmp();

}
