package com.kamjritztex.bookkeepingSystem.model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "transactions")
@NoArgsConstructor
@AllArgsConstructor 
@Data
public class TransactionModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String description;
    private long amount;
    private String type; // "debit" or "credit"
    private LocalDateTime date;
    private String accountId;
}
