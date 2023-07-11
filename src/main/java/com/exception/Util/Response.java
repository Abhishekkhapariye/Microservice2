package com.exception.Util;

import com.exception.entity.Customer;

public class Response {
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	private Customer customer;
	private Cart cart;

}
