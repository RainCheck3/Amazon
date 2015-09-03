package com.sapient.client.shop;


/**
 * 
 * @author jxu1, mohit, shivam
 * Information about a particular order, including
 * quantity, taxStatus, and item
 * 
 */
public class OrderDetail {
	private int quantity;
	private double taxStatus;
	private Order order;
	private Item item;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(double taxStatus) {
		this.taxStatus = taxStatus;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double calcSubTotal() {
		return quantity * item.getPrice();
	}

	public double calcWeight() {
		return item.getShippingWeight();
	}
}
