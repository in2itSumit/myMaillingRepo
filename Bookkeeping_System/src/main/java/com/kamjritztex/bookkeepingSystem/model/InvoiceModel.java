package com.kamjritztex.bookkeepingSystem.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "invoices")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String customerId;
    private List<String> transactionIds;
    private long totalAmount;
    private LocalDateTime issueDate;
    private LocalDateTime dueDate;
}
