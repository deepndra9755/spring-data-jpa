package com.example.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.DtoImple;
import com.example.Entity.FormRegister;
import com.example.Repository.IRepoimpls;

@Service("dd")
public class IserviceImple implements Iservice {

	@Autowired
	IRepoimpls cons;
	@Override
	public int insertingEmp(DtoImple jop) {
		// TODO Auto-generated method stub
		FormRegister dd=new FormRegister();
		BeanUtils.copyProperties(jop, dd);
		int s=cons.save(dd).getId();
		return s;
	}
	@Override
	public DtoImple insertingEmp(String name) {
		// TODO Auto-generated method stub
		FormRegister sd=cons.findByName(name);
		DtoImple sds=new DtoImple();
		BeanUtils.copyProperties(sd,sds);
		return sds;
		
	}
	

}
