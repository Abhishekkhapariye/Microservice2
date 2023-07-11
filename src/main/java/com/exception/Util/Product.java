package com.exception.Util;

public class Product {


	
	private Integer id;

	private String name;

	private Float price;

	private Integer Quantity;
	
	public Product() {
	}


	public Product(Integer id,  String name,Float price,Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.Quantity = quantity;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
//	public String getserialnumber() {
//		return serialnumber;
//	}
//	public void setserialnumber(String serialnumber) {
//		this.serialnumber = serialnumber;
//	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", Quantity=" + Quantity
			+	"]";
	}
}
