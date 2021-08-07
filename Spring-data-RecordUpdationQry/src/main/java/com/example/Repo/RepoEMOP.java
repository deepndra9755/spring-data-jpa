package com.example.Repo;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Entity.Civil;


public interface RepoEMOP extends JpaRepository<Civil,Integer> {
 
	

//updating employee record where sallary > than ?
//@Query("update Civil set sallary=sallary+1000 where sallary>:g") 
// @Modifying
// @Transactional
//	public int updateEmpSall(float g);

	//inserting records to db but not recommanded baecause we have an save() method allready
	 @Modifying
	 @Transactional
	@Query("delete Civil where sallary>:sak")
	public int insertingEmps(float sak);

	
}
