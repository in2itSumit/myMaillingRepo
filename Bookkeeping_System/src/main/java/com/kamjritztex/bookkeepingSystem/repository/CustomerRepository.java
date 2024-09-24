package com.kamjritztex.bookkeepingSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kamjritztex.bookkeepingSystem.model.CustomerModel;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel, String>{

}
