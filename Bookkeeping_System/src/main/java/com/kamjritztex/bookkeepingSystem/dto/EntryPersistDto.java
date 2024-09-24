package com.kamjritztex.bookkeepingSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntryPersistDto {
	private String accountId;
	private long amount;
	private String transactionType;
}
