package com.sapient.client.shop;


/**
 * 
 * @author jxu1, mohit, shivam Information about a particular order, including
 *         quantity, taxStatus, and item
 * 
 */


class InValidStockException extends Exception {
	public InValidStockException(String message) {
		super(message);
	}
}


class InValidTaxStatusException extends Exception {
	public InValidTaxStatusException(String message) {
		super(message);
	}
}

public class OrderDetail {
	private int quantity;
	private double taxStatus;
	private Order order;
	private Item item;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) throws Exception {
		if (quantity > 0 || quantity < 500) {
			this.quantity = quantity;
		} else {
			throw new InValidStockException("Stock value is invalid");
		}
	}

	public double getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(double taxStatus) throws Exception {
		if (taxStatus >= 0) {
			this.taxStatus = taxStatus;
		} else {
			throw new InValidTaxStatusException("TaxStatus can't be negative");
		}
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) throws Exception {
		if (order != null) {
			this.order = order;
		} else {
			throw new NullPointerException();
		}
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) throws Exception {
		if (item != null) {
			this.item = item;
		} else {
			throw new NullPointerException();
		}
	}

	public double calcSubTotal() {
		return quantity * item.getPrice();
	}

	public double calcWeight() {
		return quantity * item.getShippingWeight();
	}
}
