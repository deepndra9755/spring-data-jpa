package com.example.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entities.FormRegisterTest;

public interface MyMongoRepo extends MongoRepository<FormRegisterTest,Integer> {

}
