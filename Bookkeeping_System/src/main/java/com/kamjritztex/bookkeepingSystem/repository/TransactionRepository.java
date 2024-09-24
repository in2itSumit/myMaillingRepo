package com.kamjritztex.bookkeepingSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kamjritztex.bookkeepingSystem.model.TransactionModel;

@Repository
public interface TransactionRepository extends MongoRepository<TransactionModel, String>{

}
