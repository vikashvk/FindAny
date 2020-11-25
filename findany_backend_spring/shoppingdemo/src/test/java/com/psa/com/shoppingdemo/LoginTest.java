/**
 * 
 */
package com.psa.com.shoppingdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import com.psa.com.shoppingdemo.business.CustomerLoginServiceImpl;
import com.psa.com.shoppingdemo.controller.CustomerLogInController;
import com.psa.com.shoppingdemo.entity.Customer;

/**
 * @author my
 *
 */
public class LoginTest {

	@InjectMocks
	private CustomerLogInController loginController;
	
	@Mock
	private CustomerLoginServiceImpl logInservice;
	
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }

	@Test
	public void customerLoginTest() {
		
		Customer customer = new Customer();
		customer.setCustmail("jerry@gmail.com");
		when(logInservice.checkLogin("jerry@gmail.com", "jerry1234")).thenReturn(customer);
		
		Customer cust = loginController.checkLogin("jerry@gmail.com", "jerry1234");
				
		String mail = customer.getCustmail();
				
		assertEquals(mail, "jerry@gmail.com");
	}
	
	
}
