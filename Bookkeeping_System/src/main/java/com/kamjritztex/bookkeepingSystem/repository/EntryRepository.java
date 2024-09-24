package com.kamjritztex.bookkeepingSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kamjritztex.bookkeepingSystem.model.EntryModel;

@Repository
public interface EntryRepository extends MongoRepository<EntryModel, String>{

}
