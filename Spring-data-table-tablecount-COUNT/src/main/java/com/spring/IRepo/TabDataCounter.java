package com.spring.IRepo;

import org.springframework.data.repository.CrudRepository;

import com.spring.Entity.EmployeeDetails;

public interface TabDataCounter extends CrudRepository<EmployeeDetails,Integer>
{

}
