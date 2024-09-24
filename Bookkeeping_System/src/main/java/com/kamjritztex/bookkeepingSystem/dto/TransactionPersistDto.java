package com.kamjritztex.bookkeepingSystem.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionPersistDto {
	private String description;
    private long amount;
    private String type; // "debit" or "credit"
    private LocalDateTime date;
    private String accountId;
}
