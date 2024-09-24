package com.kamjritztex.bookkeepingSystem.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "entries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntryModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String entryId;	
	private String accountId;
	private long amount;
	private String transactionType;
}
