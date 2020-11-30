/**
 * 
 */
package com.psa.com.shoppingdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.psa.com.shoppingdemo.entity.OrderDescription;

/**
 * @author Kirankumar Narare
 *
 */
public interface OrderDescriptionDao extends JpaRepository<OrderDescription, Integer> {

}
