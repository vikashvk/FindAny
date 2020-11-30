/**
 * 
 */
package com.psa.com.shoppingdemo.business;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.com.shoppingdemo.dao.CustRegistrationDao;
import com.psa.com.shoppingdemo.entity.Customer;

/**
 * @author Kirankumar Narare
 *
 */

@Service
public class CustRegistrationServiceImpl implements CustRegistrationService{

	@Autowired
	CustRegistrationDao custDao;
	
	private static final Logger LOGGER = Logger.getLogger(CustRegistrationServiceImpl.class);

	@Override
	public String registerCustomer(Customer customer) {
		
		  Customer cust = new Customer(); 
				  
		  try { 
			  String mail = customer.getCustmail();
			  System.out.println(mail);
			  cust = custDao.findByCustmail(mail); 
			  if(cust != null) {
				  System.out.println("Customer already exist"); 
				  LOGGER.info("Customer registration failed!");  
				  return "failed"; 
			  } else {
				  custDao.save(customer); 
				  System.out.println("Customer Registered!"); 
				  return "success";
			  }
		  
		  } catch (NullPointerException e) { 
			  System.out.println(e); 
			  return "failed"; 
			  }
		 
			
	}
}
