package com.java.jms.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.java.jms.entity.MailEntity;

@Repository
public interface MailRepository extends MongoRepository<MailEntity, UUID>{

}
