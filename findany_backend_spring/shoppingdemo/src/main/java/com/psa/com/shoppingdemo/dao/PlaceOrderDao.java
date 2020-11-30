/**
 * 
 */
package com.psa.com.shoppingdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.com.shoppingdemo.entity.Order;

/**
 * @author Kirankumar Narare
 *
 */
public interface PlaceOrderDao extends JpaRepository<Order, Integer>{

}
