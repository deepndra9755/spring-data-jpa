package com.spring.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
public java.util.List<DTOimple> finder(boolean s, String prop) {
	// TODO Auto-generated method stub
	java.util.List<DTOimple> adder=new ArrayList<DTOimple>();
	Sort ss=null;
	if(s==true)
	{
		ss=Sort.by(Direction.ASC,prop);
		
	}
	else
	{
		ss=Sort.by(Direction.DESC,prop);	
	}
	
     
      Iterable<Civil> ds =obd.findAll(ss);
      for(Civil l:ds)
      {
    	DTOimple kdo=new DTOimple();
    	BeanUtils.copyProperties(l,kdo);
    	adder.add(kdo);
      }
	  return adder;
	}

	
	
	

}
