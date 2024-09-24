package com.kamjritztex.bookkeepingSystem.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoicePersistDto {
	
	private String customerId;
    private List<String> transactionIds; 
    private long totalAmount;
    private LocalDateTime issueDate;
    private LocalDateTime dueDate;
}
