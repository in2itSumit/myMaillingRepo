package com.kamjritztex.bookkeepingSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kamjritztex.bookkeepingSystem.model.InvoiceModel;

@Repository	
public interface InvoiceRepository extends MongoRepository<InvoiceModel, String>{

}
