package com.psa.com.shoppingdemo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.sun.istack.NotNull;

/**
 * @author Kirankumar Narare
 *
 */

@Entity
@Table(name="orderdescriptiontbl")
public class OrderDescription {		//child
	/*
	 * @EmbeddedId private OrderComposite ordercomp;
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int descriptionId;
	/*
	 * @NotNull private int orderId;
	 */
	@NotNull
	private int prodId;
	@NotNull
	private String productName;
	@NotNull
	private double price;
	@NotNull
	private int quantity;
	@NotNull
	private String category;
	private double totalPrice;
	public OrderDescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public OrderDescription(int descriptionId, int prodId, String productName, double price, int quantity,
			String category, double totalPrice) {
		super();
		this.descriptionId = descriptionId;
		this.prodId = prodId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.totalPrice = totalPrice;
	}






	public int getDescriptionId() {
		return descriptionId;
	}


	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}


	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	

	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "OrderDescription [descriptionId=" + descriptionId + ", prodId=" + prodId + ", productName="
				+ productName + ", price=" + price + ", quantity=" + quantity + ", category=" + category
				+ ", totalPrice=" + totalPrice + "]";
	}	
	
}
