/**
 * 
 */
package com.psa.com.shoppingdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author KIRANKUMAR NARARE
 *
 */

@Entity
@Table(name="producttbl")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int prodId;
	private String prodName;
	private String category;
	private double prodPrice;
	private String description;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int prodId, String prodName, String category, double prodPrice, String description) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.category = category;
		this.prodPrice = prodPrice;
		this.description = description;
	}


	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", category=" + category + ", prodPrice="
				+ prodPrice + ", description=" + description + "]";
	}
	
	
}
