package com.exception.Util;

import java.util.List;

import com.exception.entity.Customer;

public class Cart {

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private Integer id;

	private Float total_amount;

	private List<Product> product;

	private Customer customer;

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(Integer id, Float total_amount, List<Product> product,Customer customer ) {
		super();
		this.id = id;
		this.total_amount = total_amount;
		this.product = product;
		this.customer = customer;
	}




	

}
