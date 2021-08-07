package com.spring.Repos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.Entity.Civil;

public interface ReposDemoi extends JpaRepository<Civil,Integer> {

//public Civil findByName(String h);
//	public List<Civil> findBycityIsNotNull();
	public List<Civil> findByNameStartsWith(String string);
}
