/**
 * 
 */
package com.psa.com.shoppingdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.psa.com.shoppingdemo.entity.Customer;

/**
 * @author Kirankumar Narare
 *
 */
public interface CustRegistrationDao extends CrudRepository<Customer, Long>{

}
