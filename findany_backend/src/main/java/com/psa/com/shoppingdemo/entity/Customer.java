/**
 * 
 */
package com.psa.com.shoppingdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kirankumar Narare
 *
 */

@Entity
@Table(name = "customertbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long custid;
	@Column(length = 40)
	private String custname;
	@Column(length = 10)
	private String gender;
	private long custmobileno;
	@Column(length = 20)
	private String custmail;
	@Column(length = 15)
	private String custpass;
	@Column(length = 40)
	private String custaddress;
	public Long getCustid() {
		return custid;
	}
	public void setCustid(Long custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getCustmobileno() {
		return custmobileno;
	}
	public void setCustmobileno(long custmobileno) {
		this.custmobileno = custmobileno;
	}
	public String getCustmail() {
		return custmail;
	}
	public void setCustmail(String custmail) {
		this.custmail = custmail;
	}
	public String getCustpass() {
		return custpass;
	}
	public void setCustpass(String custpass) {
		this.custpass = custpass;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", gender=" + gender + ", custmobileno="
				+ custmobileno + ", custmail=" + custmail + ", custpass=" + custpass + ", custaddress=" + custaddress
				+ "]";
	}
		
	
}
