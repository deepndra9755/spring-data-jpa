package com.spring.Service;

import java.util.List;

import com.spring.Dto.DTOimple;
import com.spring.Entity.Civil;

public interface CivilEmpFind {



	public void finder(boolean s, String prop);

	   public List<Civil> finder();
	
	
}
