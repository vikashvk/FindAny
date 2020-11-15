package com.psa.com.shoppingdemo.business;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psa.com.shoppingdemo.dao.ProductDao;
import com.psa.com.shoppingdemo.entity.Product;

/**
 * @author KIRANKUMAR NARARE
 *
 */
@Service
public class ProductServiceImpl implements ProductService{

private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(ProductDao theMenuDao) {
		productDao=theMenuDao;
	}
	
	@Transactional
	public List<Product> findAll() {
	
		return productDao.findAll();
	}

	
	public Product findById(int prodId) {
		
		return null;
	}

	@Transactional
	public String save(Product product) {

		productDao.save(product);
		return "Product Added Successfully!";
	}

	public void deleteById(int itemid) {
		// TODO Auto-generated method stub
		
	}

	public void updateFooditem(int itemid, Product product) {
		// TODO Auto-generated method stub
		
	}

}
