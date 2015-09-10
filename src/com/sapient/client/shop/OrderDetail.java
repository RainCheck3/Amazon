package com.sapient.client.shop;

/**
 * 
 * @author jxu1, mohit, shivam Information about a particular order, including
 *         quantity, taxStatus, and item
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
		if (quantity > 0 && quantity < 500) {
			this.quantity = quantity;
		} else {
			throw new IllegalArgumentException("Stock value is invalid");
		}
	}

	public double getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(double taxStatus) {
		if (taxStatus >= 0) {
			this.taxStatus = taxStatus;
		} else {
			throw new IllegalArgumentException("TaxStatus can't be negative");
		}
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		if (order != null) {
			this.order = order;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		if (item != null) {
			this.item = item;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double calcSubTotal() {
		return quantity * item.getPrice();
	}

	public double calcWeight() {
		return quantity * item.getShippingWeight();
	}
}
