package com.psa.com.shoppingdemo.business;

import java.util.List;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.com.shoppingdemo.controller.ProductController;
import com.psa.com.shoppingdemo.dao.ProductDao;
import com.psa.com.shoppingdemo.entity.Product;

/**
 * @author KIRANKUMAR NARARE
 *
 */
@Service
public class ProductServiceImpl implements ProductService{

private static final Logger LOGGER = Logger.getLogger(ProductController.class);
private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(ProductDao theMenuDao) {
		productDao=theMenuDao;
	}
	
	@Transactional
	public List<Product> findAll() {
	
		return productDao.findAll();
	}

	@Transactional
	public Product findById(int prodId) {
		
		return productDao.findByProductId(prodId);
	}

	@Transactional
	public String save(Product product) {

		productDao.save(product);
		return "Product Added Successfully!";
	}

	public void updateProduct(int itemid, Product product) {
		
		if(productDao.findByProductId(itemid) == null) {
			LOGGER.info("Item Not found");
			throw new NullPointerException("Item Not found");
		} else {
			System.out.println("first : " + product);
			Product item = productDao.findByProductId(itemid);
			item.setProdName(product.getProdName());
			item.setCategory(product.getCategory());
			item.setProdPrice(product.getProdPrice());
			item.setDescription(product.getDescription());
			System.out.println("updated: " + item);
			productDao.save(item);
		}
	}

	@Transactional
	public void removeById(int productid) {
		
		productDao.removeByProductId(productid);
	}

}
