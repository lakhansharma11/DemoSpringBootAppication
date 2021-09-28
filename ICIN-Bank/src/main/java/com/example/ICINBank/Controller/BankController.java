package com.example.ICINBank.Controller;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ICINBank.Model.CustomerInfo;
import com.example.ICINBank.Service.CustomerService;

@RestController

public class BankController {
	
	@Autowired
	private CustomerService cs;

@PostMapping("/Registation")
@Transactional
public String registerCustomer(@RequestBody CustomerInfo cust)
{
	cs.saveMyCustomer(cust);
	return "Hello "+cust.getFirstName()+" you registation is successfull";
}


}
