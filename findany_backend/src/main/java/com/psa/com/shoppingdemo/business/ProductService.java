package com.psa.com.shoppingdemo.business;

import java.util.List;
import com.psa.com.shoppingdemo.entity.Product;

/**
 * @author KIRANKUMAR NARARE
 *
 */
public interface ProductService {

	public List<Product> findAll();
	public Product findById(int prodId);
	public String save(Product product);
	public void deleteById(int itemid);
	public void updateFooditem(int itemid, Product product);
}
