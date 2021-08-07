package com.example.Repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.entities.FormRegisterTest;

public interface MyMongoRepo extends MongoRepository<FormRegisterTest,Integer> {
	
	@Query(value ="{name:?0}")
	public List<FormRegisterTest> getTotal(String name);

}
