package com.sapient.client.payment;

import com.sapient.client.shop.Order;

public class Payment {
	private double amountPaid;
	Order orderObjRef;

	public Order getOrderObjRef() {
		return orderObjRef;
	}

	public void setOrderObjRef(Order orderObjRef) throws Exception {
		if (orderObjRef != null) {
			this.orderObjRef = orderObjRef;
		} else {
			throw new NullPointerException();
		}
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amount) {
		this.amountPaid = amount;

	}

}
