package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.FormRegister;

public interface IRepoimpls extends JpaRepository<FormRegister,Integer> {

	
	public FormRegister findByName(String na);
}
