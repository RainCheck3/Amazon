package com.sapient.client.shop;

/**
 * 
 * @author jxu1, mohit, shivam
 * A single item in an order, interacts with orderDetail,
 * includes information about price, shipping weight
 *
 */
public class Item {
	private double price;
	private double weight;
	private double shippingWeight;
	private String description;
	private OrderDetail orderDetail;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	
	public double getWeight() {
		return weight;
	}
}
