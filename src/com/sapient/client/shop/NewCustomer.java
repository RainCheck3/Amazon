package com.sapient.client.shop;

import static com.sapient.client.util.IsNumber.isNumeric;

/**
 * 
 * @author jxu1, mohit, shivam This class represents a customer name, address,
 *         and order, along with getter and setter methods for each
 */
public class NewCustomer {
	private String name;
	private String address;
	private Order order;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException(
					"Invalid name entered, length needs to be greater than 2");
		} else {
			this.name = name;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address.length() < 10 || !(isNumeric(address.substring(0, 1)))) {
			throw new IllegalArgumentException(
					"Invalid address, length must be greater than 10 and first character needs to be numeric");
		} else {
			this.address = address;
		}
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		if (order == null) {
			throw new IllegalArgumentException("Null order object entered");
		} else {
			this.order = order;
		}
	}
}
