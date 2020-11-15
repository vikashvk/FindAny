/**
 * 
 */
package com.psa.com.shoppingdemo.business;

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

	@Override
	public String registerCustomer(Customer customer) {
		
		custDao.save(customer);
		System.out.println("customer saved!");
		return "Thank you for Registration";
	}
}
