package com.example.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entities.FormRegisterTest;
import java.lang.String;
import java.util.List;

public interface MyMongoRepo extends MongoRepository<FormRegisterTest,Integer> {
	public List<FormRegisterTest> findByJobLocation(String joblocation);

}
