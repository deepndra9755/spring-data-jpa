package com.spring.Service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Dto.DTOimple;
import com.spring.Entity.Civil;
import com.spring.Repos.ReposDemoi;

@Service
public class CivilEmpFindImpl implements CivilEmpFind {
@Autowired
ReposDemoi obd;

	@Override
	public String finder(Integer kk) {
		 
	     try {
		 obd.deleteById(kk);
		 return "record deleted properly";
	     }
	     catch (Exception e) {
			// TODO: handle exception
	    	 return "record not found from given id "+kk;
		}
		
	}
	

}
