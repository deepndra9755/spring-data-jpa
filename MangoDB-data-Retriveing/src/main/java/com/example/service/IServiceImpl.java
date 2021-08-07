package com.example.service;

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
	public Optional<FormRegisterTest> GetForm(int id) {
		// TODO Auto-generated method stub
		//FormRegisterTest ent=new FormRegisterTest();
		//BeanUtils.copyProperties();
		
		Optional<FormRegisterTest> kop=obj.findById(id);
	    
		return kop;
	
	}

}
