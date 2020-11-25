/*
 * Team:group-1
 * author:Urmila k
 * Description:junit test for Customer Registration
 * 
 * */
package com.psa.com.shoppingdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import com.psa.com.shoppingdemo.business.CustRegistrationServiceImpl;
import com.psa.com.shoppingdemo.controller.CustRegistrationController;
import com.psa.com.shoppingdemo.entity.Customer;

/*@TestInstance(Lifecycle.PER_CLASS)
@ActiveProfiles("test")
@WebMvcTest(controllers = CustRegistrationTest.class)*/

public class CustRegistrationTest {
	
	@InjectMocks
	CustRegistrationController custreg;
	
	@Mock
	CustRegistrationServiceImpl custservice;
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void CustRegistrationTest() {
		Customer cust = new Customer();
		cust.setCustname("kk");
		cust.setGender("Male");
		cust.setCustpass("kk1234");
		cust.setCustmail("kbn@gmail.com");
		cust.setCustaddress("karmala");
		cust.setCustmobileno(989039899);
		
		when(custservice.registerCustomer(cust)).thenReturn("Thank you for Registration");
		String result = custreg.doRegistration(cust);
		assertEquals(result, "Thank you for Registration");
		}
	
}
