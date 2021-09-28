package com.example.ICINBank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ICINBank.Model.CustomerInfo;
import com.example.ICINBank.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	
	private CustomerRepository cr;
	
	public CustomerService() {}

	public CustomerService(CustomerRepository cr) {
		super();
		this.cr = cr;
	}
	
	public void saveMyCustomer(CustomerInfo info)
	{
		cr.save(info);
	}
	
	

}
