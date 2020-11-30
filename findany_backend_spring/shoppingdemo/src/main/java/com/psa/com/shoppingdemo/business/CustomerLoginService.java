package com.psa.com.shoppingdemo.business;

import com.psa.com.shoppingdemo.entity.Customer;
/**
 * @author PRASAD RAUT
 *
 */
public interface CustomerLoginService {

	public Customer checkLogin(String custmail,String custpass);
}
