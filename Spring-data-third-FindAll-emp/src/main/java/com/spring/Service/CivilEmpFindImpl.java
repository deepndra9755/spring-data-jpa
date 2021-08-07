package com.spring.Service;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.Dto.DTOimple;
import com.spring.Entity.Civil;
import com.spring.Repos.ReposDemoi;
import antlr.collections.List;

@Service
public class CivilEmpFindImpl implements CivilEmpFind {
@Autowired
ReposDemoi obd;

	@Override
	public java.util.List<DTOimple> finder(Integer kk) {
		
		 java.util.List<DTOimple> k=new ArrayList<DTOimple>();
	   Iterable<Civil> c=obd.findAll();
	  for(Civil f:c)
	  {  
		  DTOimple csd=new DTOimple();
		  BeanUtils.copyProperties(f, csd);
		  k.add(csd);
	  }
	  
		return k;
	}
	

}
