package com.psa.com.shoppingdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.psa.com.shoppingdemo.business.CustRegistrationServiceImpl;
import com.psa.com.shoppingdemo.entity.Customer;

/**
 * @author Kirankumar Narare
 *
 */

@CrossOrigin(allowedHeaders = "*", origins = "http://localhost:4200/")
@RequestMapping("/findany")
@RestController
public class CustRegistrationController {

	@Autowired
	CustRegistrationServiceImpl custservice;
	
	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public String doRegistration(@RequestBody Customer customer) {
		
		String result = custservice.registerCustomer(customer);
		return result;
	}
}
