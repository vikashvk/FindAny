package com.psa.com.shoppingdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.com.shoppingdemo.dao.OrderDescriptionDao;
import com.psa.com.shoppingdemo.dao.PlaceOrderDao;
import com.psa.com.shoppingdemo.entity.Order;
import com.psa.com.shoppingdemo.entity.OrderDescription;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/findany")
@RestController
public class PlaceOrderController {

	@Autowired
	private PlaceOrderDao orderDao;
	
	@Autowired
	private OrderDescriptionDao orderDiscriptionDao;
	
	@PostMapping("/placeorder")
	public String placeOrder(@RequestBody Order order) {
		
		orderDao.save(order);
		
		return "success";
	}
}
