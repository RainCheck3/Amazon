package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.client.shop.Item;
import com.sapient.client.shop.NewCustomer;
import com.sapient.client.shop.Order;
import com.sapient.client.shop.OrderDetail;

public class NewCustomerTests {
	static Order orderObjRef;
	static OrderDetail orderDetailObjRef;
	static NewCustomer newCustomerObjRef;
	static Item itemObjRef;

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

	@Test
	public final void testInvalidName() {
		try {
			newCustomerObjRef.setName("J");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidName() {
		newCustomerObjRef.setName("Jiaju");
		assertEquals("Jiaju", newCustomerObjRef.getName());
	}
	
	@Test
	public final void testInvalidAddress() {
		try {
			newCustomerObjRef.setAddress("Lakeshore Drive");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		try {
			newCustomerObjRef.setAddress("100 Lake");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidAddress() {
		newCustomerObjRef.setAddress("100 Lakeshore Drive");
		assertEquals("100 Lakeshore Drive", newCustomerObjRef.getAddress());
	}
	
	@Test
	public final void testInvalidOrder() {
		try {
			newCustomerObjRef.setOrder(null);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidOrder() {
		newCustomerObjRef.setOrder(orderObjRef);
		assertTrue(newCustomerObjRef.getOrder() instanceof Order);
	}
	
	

}
