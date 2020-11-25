package com.psa.com.shoppingdemo.dao;

import java.util.List;

import com.psa.com.shoppingdemo.entity.Product;

/**
 * @author KIRANKUMAR NARARE
 *
 */
public interface ProductDao {

	public List<Product> findAll();
	public Product findByProductId(int prodId);
	public void save(Product prodct);
	public void removeByProductId(int productid);
}
