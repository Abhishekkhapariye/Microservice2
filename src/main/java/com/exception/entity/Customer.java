package com.exception.entity;

import com.exception.Util.Cart;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String cus_name;
	private Long cus_mob_no;
	private String password;
	
//	@OneToOne(mappedBy = "Customer",cascade = CascadeType.ALL)
//	private Cart cart;

	public Customer() {

	}

	public Customer(Integer id, String cus_name, Long cus_mob_no,String password ) {
		super();
		this.id = id;
		this.cus_name = cus_name;
		this.cus_mob_no = cus_mob_no;
		this.password=password;
//		this.cart=cart;
//				this.products = products;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public Long getCus_mob_no() {
		return cus_mob_no;
	}

	public void setCus_mob_no(Long cus_mob_no) {
		this.cus_mob_no = cus_mob_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public Cart getCart() {
//		return cart;
//	}
//
//	public void setCart(Cart cart) {
//		this.cart = cart;
//	}


}
