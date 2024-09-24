package com.kamjritztex.bookkeepingSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPersistDto {
	private String name;
	private String email;
	private String billingAddress;
}
