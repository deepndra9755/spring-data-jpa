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

//getting 4 column record based on name start word and city and sallary	
@Query("select name,address,sallary,job from Civil where sallary>?1 and name like ?2 and city=?3")
    
	public List<Object[]> findBySallary(float sall,String name,String city);

@Query("select name from Civil where sallary>:g") 
    
	public List<String> findBySallary(float g);
//
	//getting 4 column record based on name	
	//@Query("select name,address,sallary,job from Civil where sallary>?1")
	//public List<Object[]> findBySallary(float sall);

	
}
