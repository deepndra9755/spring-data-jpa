package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.example.Repos.MyMongoRepo;
import com.example.dto.DTOimpl;
import com.example.entities.FormRegisterTest;

@Service("ss")
public class IServiceImpl implements IService {

   @Autowired
   MyMongoRepo obj;
	@Override
	public List<DTOimpl> GetEmps(String na) {
		// TODO Auto-generated method stub
		//FormRegisterTest ent=new FormRegisterTest();
		//BeanUtils.copyProperties();
		List<DTOimpl> hs=new ArrayList<DTOimpl>();
		//Optional<FormRegisterTest> kop=obj.findById(id);
	    List<FormRegisterTest> ds=obj.getTotal(na);
	    for(FormRegisterTest sd:ds)
	    {
	    DTOimpl od=new DTOimpl();
	    BeanUtils.copyProperties(sd, od);
	    hs.add(od);
	    }
		return hs;
	
	}

}
