package com.example.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.DtoIMpl;
import com.example.Entity.EmployeeMM;
import com.example.Repo.RepoEMOP;
@Service("ss")
public class IserviceImpl implements IEmployeeInsert{
    
	@Autowired
	RepoEMOP jj;
	
	@Override
	public int employeeInsert(DtoIMpl k) {
		// TODO Auto-generated method stub
		EmployeeMM j=new EmployeeMM();
		BeanUtils.copyProperties(k, j);
		EmployeeMM kd=jj.save(j);
		
		return kd.getId();
	}

}
