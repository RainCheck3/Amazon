package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.client.shop.NewCustomer;
import com.sapient.client.shop.Order;
import com.sapient.client.shop.OrderDetail;

public class NewCustomerTests {
	static Order orderObjRef;
	static OrderDetail orderDetailObjRef;
	static NewCustomer newCustomerObjRef;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		orderObjRef = new Order();
		newCustomerObjRef = new NewCustomer();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		orderObjRef = null;
		newCustomerObjRef = null;
	}

	@Test(expected = IllegalArgumentException.class)
	public final void testInvalidName() {
		newCustomerObjRef.setName("J");
	}

	@Test
	public final void testValidName() {
		newCustomerObjRef.setName("Jiaju");
		assertEquals("Jiaju", newCustomerObjRef.getName());
	}

	@Test(expected = IllegalArgumentException.class)
	public final void testInvalidAddress1() {
		newCustomerObjRef.setAddress("Lakeshore Drive");
	}

	@Test(expected = IllegalArgumentException.class)
	public final void testInvalidAddress2() {
		newCustomerObjRef.setAddress("100 Lake");
	}

	@Test
	public final void testValidAddress() {
		newCustomerObjRef.setAddress("100 Lakeshore Drive");
		assertEquals("100 Lakeshore Drive", newCustomerObjRef.getAddress());
	}

	@Test(expected = IllegalArgumentException.class)
	public final void testInvalidOrder() {
		newCustomerObjRef.setOrder(null);
	}

	@Test
	public final void testValidOrder() {
		newCustomerObjRef.setOrder(orderObjRef);
		assertTrue(newCustomerObjRef.getOrder() instanceof Order);
	}

}
