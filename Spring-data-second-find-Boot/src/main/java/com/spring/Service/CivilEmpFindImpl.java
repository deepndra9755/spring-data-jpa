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
	public DTOimple finder(Integer kk) {
		 DTOimple cs=new DTOimple();
	   Optional<Civil> c=obd.findById(kk);
	   if(c.isPresent())
	   {
	      Civil d=new Civil();
	       d=c.get();
	      BeanUtils.copyProperties(d, cs);
	      
	   }
	  
		return cs;
	}
	

}
