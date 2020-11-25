
  package com.psa.com.shoppingdemo.dao;
  
  import org.springframework.data.jpa.repository.JpaRepository; import
  org.springframework.data.repository.CrudRepository;
  
  import com.psa.com.shoppingdemo.entity.Customer;
 /**
	 * @author PRASAD RAUT
	 *
	 */
public interface CustomerLoginDao extends JpaRepository<Customer, Integer> {
		  
	Customer findByCustmailAndCustpass(String custmail, String custpass); 
}
		 