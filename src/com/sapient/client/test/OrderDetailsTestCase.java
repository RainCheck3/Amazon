package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sapient.client.payment.Payment;
import com.sapient.client.shop.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrderDetailsTestCase {
	static Order orderObjRef;
	static OrderDetail orderDetail;
	static Item itemObjRef;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		orderObjRef = new Order();
		orderDetail = new OrderDetail();
		itemObjRef = new Item();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		orderObjRef = null;
		orderDetail = null;
		itemObjRef = null;
	}

	@Test
	public final void testInvalidQuantity() {
		try {
			orderDetail.setQuantity(0);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		try {
			orderDetail.setQuantity(501);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidQuantity() {
		orderDetail.setQuantity(20);
		assertEquals(20, orderDetail.getQuantity());
	}

	@Test
	public final void testInvalidTaxStatus() {
		try {
			orderDetail.setTaxStatus(-1);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidTaxStatus() {
		orderDetail.setTaxStatus(0.3);
		assertEquals(0.3, orderDetail.getTaxStatus(), 0);
	}

	@Test
	public final void testInvalidOrder() {
		try {
			orderDetail.setOrder(null);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidOrder() {
		orderDetail.setOrder(orderObjRef);
		assertTrue(orderDetail.getOrder() instanceof Order);
	}

	@Test
	public final void testInvalidItem() {
		try {
			orderDetail.setItem(null);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidItem() {
		orderDetail.setItem(itemObjRef);
		assertTrue(orderDetail.getItem() instanceof Item);
	}

	@Test
	public final void testCalcSubTotal() {
	
		// Create item objects
		Item item = new Item();

		try {
			item.setPrice(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		orderDetail.setItem(item);
		orderDetail.setQuantity(5);

		assertEquals(500, orderDetail.calcSubTotal(), 0);
	}

	@Test
	public final void testCalcWeight() {
		
		// Create item objects
		Item item = new Item();

		try {
			// Set item weights & shipping weights
			item.setWeight(8);
			item.setShippingWeight(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		orderDetail.setItem(item);
		orderDetail.setQuantity(8);

		assertEquals(88, orderDetail.calcWeight(), 0);
	}

}
