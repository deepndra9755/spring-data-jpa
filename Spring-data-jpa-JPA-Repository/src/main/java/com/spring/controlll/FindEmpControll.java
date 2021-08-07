package com.spring.controlll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.Dto.DTOimple;
import com.spring.Entity.Civil;
import com.spring.Service.CivilEmpFind;
@Controller("ff")
public class FindEmpControll implements FindEmps {
	@Autowired
	CivilEmpFind oo;
    List<DTOimple> d=new ArrayList<DTOimple>();
	@Override
	public void findEmp(boolean s, String prop) {
		// TODO Auto-generated method stub
		 oo.finder(s, prop);
	}

	@Override
	public List<DTOimple> findEmp() {
		// TODO Auto-generated method stub
           List<Civil> sk=oo.finder();
           for(Civil s:sk)
           {
            DTOimple jd=new DTOimple();
            BeanUtils.copyProperties(s,jd);
            d.add(jd);
           }
           return d;
	}


	
	
	

}
