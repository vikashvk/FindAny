/**
 * 
 */
package com.psa.com.shoppingdemo.entity;

import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.sun.istack.NotNull;

/**
 * @author Kirankumar Narare
 *
 */

@Entity
@Table(name="ordertbl")
public class Order {					

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String OrederDescription;
	@NotNull
	private int customerId;
	@NotNull
	private Date orderDate;
	@NotNull
	private double orderAmount;
	
	 @OneToMany(targetEntity = OrderDescription.class, cascade= CascadeType.ALL)
	 @JoinColumn(name= "orderId_fk", referencedColumnName = "orderId")
	 private List<OrderDescription> prodDesc;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(int orderId, String orederDescription, int customerId, Date orderDate, double orderAmount,
			List<OrderDescription> prodDesc) {
		super();
		this.orderId = orderId;
		OrederDescription = orederDescription;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.prodDesc = prodDesc;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrederDescription() {
		return OrederDescription;
	}

	public void setOrederDescription(String orederDescription) {
		OrederDescription = orederDescription;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	

	public List<OrderDescription> getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(List<OrderDescription> prodDesc) {
		this.prodDesc = prodDesc;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", OrederDescription=" + OrederDescription + ", customerId=" + customerId
				+ ", orderDate=" + orderDate + ", orderAmount=" + orderAmount + ", prodDesc=" + prodDesc + "]";
	}
			
}
