package com.sapient.client.shop;

/**
 * 
 * @author jxu1, mohit, shivam 
 * This class represents a customer name, address, and order, 
 * along with getter and setter methods for each
 */
public class NewCustomer {
	private String name;
	private String address;
	private Order order;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
