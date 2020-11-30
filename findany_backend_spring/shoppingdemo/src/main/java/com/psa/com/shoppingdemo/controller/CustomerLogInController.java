
package com.psa.com.shoppingdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.com.shoppingdemo.business.CustRegistrationServiceImpl;
import com.psa.com.shoppingdemo.business.CustomerLoginServiceImpl;
import com.psa.com.shoppingdemo.entity.Customer;

/**
 * @author PRASAD RAUT
 *
 */

@CrossOrigin(allowedHeaders = "*", origins = "http://localhost:4200/")
@RequestMapping("/findany")
@RestController
public class CustomerLogInController {

	private static final Logger LOGGER = Logger.getLogger(CustomerLogInController.class);

	
	@Autowired
	CustomerLoginServiceImpl loginservice;

	@GetMapping("/customerlogin/{custmail}/{custpass}")
	public Customer checkLogin(@PathVariable String custmail,@PathVariable String custpass) {
		
		Customer searchcustomer=null;
		try {
			searchcustomer=loginservice.checkLogin(custmail, custpass);
		return searchcustomer;
		}
		catch(NullPointerException exception) {
			System.out.println(exception.getMessage());
			LOGGER.info(exception.getMessage());
		}
		return searchcustomer;
		
	}
}
