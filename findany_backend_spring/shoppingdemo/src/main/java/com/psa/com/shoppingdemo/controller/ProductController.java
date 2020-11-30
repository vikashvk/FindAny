package com.psa.com.shoppingdemo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.com.shoppingdemo.business.ProductService;
import com.psa.com.shoppingdemo.entity.Product;

/**
 * @author KIRANKUMAR NARARE
 *
 */
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/findany")
public class ProductController {
	
	private static final Logger LOGGER = Logger.getLogger(ProductController.class);

private ProductService productService;
	
	@Autowired
	public ProductController(ProductService theMenuService) {
		productService=theMenuService;
	}
	
	@GetMapping("/allproducts")
	public List<Product> findAll()
	{
		return productService.findAll();
	}
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		
		String result = productService.save(product);
		System.out.println(result);
		return product;
		
	}
	
	@DeleteMapping("/remove/{prodId}")
	public String removeProduct(@PathVariable int prodId)
	{
		Product tempProduct=productService.findById(prodId);
		if(tempProduct==null) {
			LOGGER.error("NullPointer exception");
			throw new RuntimeException("Item id not found " + prodId);
		}
		productService.removeById(prodId);
		return "deleted item id " + prodId;
	}
	
	@PutMapping("/update/{prodId}")
	public Product updateMenu(@PathVariable int prodId, @RequestBody Product product) {
		System.out.println("enter controller");
		productService.updateProduct(prodId, product);
		return product;
	}
}
