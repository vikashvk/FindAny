/**
 * 
 */
package com.psa.com.shoppingdemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.com.shoppingdemo.dao.CustomerLoginDao;
import com.psa.com.shoppingdemo.entity.Customer;

/**
 * @author PRASAD RAUT
 *
 */
@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{

	@Autowired
	CustomerLoginDao custdao;
	
	@Override
	public Customer checkLogin(String custmail, String custpass) throws NullPointerException {
		
		return custdao.findByCustmailAndCustpass(custmail, custpass);
	}
}
