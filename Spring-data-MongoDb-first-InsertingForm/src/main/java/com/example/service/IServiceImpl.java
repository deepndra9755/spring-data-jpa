package com.example.service;

import java.util.List;

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
	public int GetForm(DTOimpl obd) {
		// TODO Auto-generated method stub
		FormRegisterTest ent=new FormRegisterTest();
		BeanUtils.copyProperties(obd,ent);
	   return obj.insert(ent).getId();
	
	}

}
