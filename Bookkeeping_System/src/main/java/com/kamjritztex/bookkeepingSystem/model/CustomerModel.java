package com.kamjritztex.bookkeepingSystem.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String email;
    private String billingAddress;
}
