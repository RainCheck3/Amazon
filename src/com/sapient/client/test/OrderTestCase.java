package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.client.payment.Payment;
import com.sapient.client.shop.*;

public class OrderTestCase {
	static Order orderObjRef;
	static List<OrderDetail> orderDetails;
	static NewCustomer newCustomerObjRef;
	static Item itemObjRef;
	static Payment paymentObjRef;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		orderObjRef = new Order();
		orderDetails = new ArrayList<OrderDetail>();
		newCustomerObjRef = new NewCustomer();
		itemObjRef = new Item();
		paymentObjRef = new Payment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		orderObjRef = null;
		orderDetails = null;
		newCustomerObjRef = null;
		itemObjRef = null;
		paymentObjRef = null;
	}

	@Test
	public final void testInvalidDate() {
		Date date = null;
		try {
			orderObjRef.setDate(date);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public final void testValidDate() {
		Date date = new Date(1990, 12, 3);
		orderObjRef.setDate(date);
		assertEquals(1990, orderObjRef.getDate().getYear());
		assertEquals(12, orderObjRef.getDate().getMonth());
		assertEquals(3, orderObjRef.getDate().getDay());
	}

	@Test
	public final void testInvalidStatus() {
		String status = null;

		try {
			orderObjRef.setStatus(status);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidStatus() {
		String status = "Order placed";
		orderObjRef.setStatus(status);
		assertEquals("Order placed", orderObjRef.getStatus());
	}

	@Test
	public final void testInvalidCustomer() {
		try {
			orderObjRef.setCustomer(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidCustomer() {
		orderObjRef.setCustomer(newCustomerObjRef);
		assertTrue(orderObjRef.getCustomer() instanceof NewCustomer);
	}

	@Test
	public final void testInvalidPayment() {
		try {
			orderObjRef.setPayment(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidPayment() {
		orderObjRef.setPayment(paymentObjRef);
		assertTrue(orderObjRef.getPayment() instanceof Payment);
	}

	@Test
	public final void testInvalidOrderDetail() {
		try {
			orderObjRef.setOrderDetail(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidOrderDetail() {
		orderObjRef.setOrderDetail(orderDetails);
		assertTrue(orderObjRef.getOrderDetail() instanceof List<?>);
	}

	@Test
	public final void testCalcTax() {

	}

	@Test
	public final void testCalcTotal() {

	}

	@Test
	public final void testCalcTotalWeight() {

	}

}
