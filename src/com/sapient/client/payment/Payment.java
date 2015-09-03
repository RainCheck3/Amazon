package com.sapient.client.payment;

import com.sapient.client.shop.Order;

public class Payment {
	private double totalAmount;
	Order orderObjRef;
	
	public Order getOrderObjRef() {
		return orderObjRef;
	}
	public void setOrderObjRef(Order orderObjRef) {
		this.orderObjRef = orderObjRef;
	}
	
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
