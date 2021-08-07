package com.spring.Service;

import java.util.ArrayList;
import java.util.Iterator;
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
public java.util.List<DTOimple> finder(java.util.List<DTOimple> k) {
	// TODO Auto-generated method stub
	
	for(DTOimple d:k)
	{
	System.out.println("getter service");
	System.out.println(d);	
	}
	java.util.List<Civil> ks= new ArrayList<Civil>();
	java.util.List<DTOimple> kg= new ArrayList<DTOimple>();
	java.util.List<DTOimple> kp= new ArrayList<DTOimple>();
	for(DTOimple po:k)
	{
		Civil kds=new Civil();	
		BeanUtils.copyProperties(po, kds);
		  ks.add(kds);
	}
	java.util.List<Civil> kd=(java.util.List<Civil>) obd.saveAll((Iterable<Civil>) ks);
       
//	Iterator<Civil> js=kss.iterator();
//       while(js.hasNext())
//       {
//    	     Civil sp=js.next(); 
//    	     DTOimple jsx=new DTOimple();
//    	     BeanUtils.copyProperties(sp, jsx);
//    	     kg.add(jsx);
//       }
	for(Civil kq:kd)
	{
	  	DTOimple jds=new DTOimple();
	  	BeanUtils.copyProperties(kq, jds);
	  	kp.add(jds);
	}
	return  kp;
}

	
	
	

}
