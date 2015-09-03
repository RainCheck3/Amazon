
package com.sapient.client.shop;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sapient.client.payment.Payment;

/**
 * 
 * @author jxu1, mohit, shivam
 * Represents an Order made, with regards to
 * a specific customer, orderDetail, and payment
 */
public class Order {
	private Date date;
	private String status;
	private NewCustomer customer;
	private Payment payment;
	private List<OrderDetail> orderDetails;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public NewCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(NewCustomer customer) {
		this.customer = customer;
	}

	public Payment getPayment() { 
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<OrderDetail> getOrderDetail() {
		return orderDetails;
	}

	public void setOrderDetail(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	public double calcTax() {
		double result;
		
		Iterator<OrderDetail> iterator = orderDetails.iterator();
		
		
		
		
		return orderDetail.calcSubTotal() * orderDetail.getTaxStatus();
	};
	
	public double calcTotal() {
		return orderDetail.calcSubTotal() + calcTax();
	}
	
	public double calcTotalWeight() {
		return orderDetail.getQuantity() * orderDetail.calcWeight();
	}

}
