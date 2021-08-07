package com.spring.Repos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.Entity.Civil;

public interface ReposDemoi extends PagingAndSortingRepository<Civil,Integer> {


}
