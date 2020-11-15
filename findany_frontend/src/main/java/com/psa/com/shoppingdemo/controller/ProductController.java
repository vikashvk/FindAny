package com.psa.com.shoppingdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.com.shoppingdemo.business.ProductService;
import com.psa.com.shoppingdemo.entity.Product;

/**
 * @author KIRANKUMAR NARARE
 *
 */
@RestController
@CrossOrigin(origins = "http://13.235.71.80:4200")
@RequestMapping("/product")
public class ProductController {

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
	public Product addMenu(@RequestBody Product product) {
		
		String result = productService.save(product);
		System.out.println(result);
		return product;
		
	}
}
