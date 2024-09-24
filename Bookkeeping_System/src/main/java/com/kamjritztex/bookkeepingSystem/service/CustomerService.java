package com.kamjritztex.bookkeepingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamjritztex.bookkeepingSystem.dto.CustomerPersistDto;
import com.kamjritztex.bookkeepingSystem.model.CustomerModel;
import com.kamjritztex.bookkeepingSystem.repository.CustomerRepository;

@Service
public interface CustomerService {

	
	
	public CustomerPersistDto saveCustomer(CustomerModel custModel);
	public CustomerPersistDto getCustomerById(String custId);
	public CustomerPersistDto deleteCustomer(String custId);
	public CustomerPersistDto updateCustomer(CustomerDto custModel);
	public CustomerPersistDto saveCustomer(CustomerModel custModel);
	
}
