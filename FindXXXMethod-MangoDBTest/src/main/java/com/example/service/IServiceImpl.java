package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repos.MyMongoRepo;
import com.example.dto.DTOimpl;
import com.example.entities.FormRegisterTest;

@Service("ss")
public class IServiceImpl implements IService {

   @Autowired
   MyMongoRepo obj;
	@Override
	public List<DTOimpl> GetForm(String id) {
		// TODO Auto-generated method stub
		//FormRegisterTest ent=new FormRegisterTest();
		//BeanUtils.copyProperties();
		List<DTOimpl> ssd=new ArrayList<DTOimpl>();
		List<FormRegisterTest> kl=obj.findByJobLocation(id);
		//System.out.println(kl.get(1));
		for(FormRegisterTest s:kl)
		{
			DTOimpl dt=new DTOimpl();
			BeanUtils.copyProperties(s,dt);
			ssd.add(dt);
		}
       
		return ssd;
	
	}

}
