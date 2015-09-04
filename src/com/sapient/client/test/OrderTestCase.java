package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.client.payment.Payment;
import com.sapient.client.shop.*;

public class OrderTestCase {
	static Order orderObjRef;
	static List<OrderDetail> orderDetailsList;
	static NewCustomer newCustomerObjRef;
	static Item itemObjRef;
	static Payment paymentObjRef;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		orderObjRef = new Order();
		orderDetailsList = new ArrayList<OrderDetail>();
		newCustomerObjRef = new NewCustomer();
		itemObjRef = new Item();
		paymentObjRef = new Payment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		orderObjRef = null;
		orderDetailsList = null;
		newCustomerObjRef = null;
		itemObjRef = null;
		paymentObjRef = null;
	}

	@Test
	public final void testInvalidDate() {
		Date date = null;
		try {
			orderObjRef.setDate(date);
		} catch (NullPointerException e) {
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
		} catch (NullPointerException e) {
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
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidCustomer() {
		orderObjRef.setCustomer(newCustomerObjRef);
		assertTrue(orderObjRef.getCustomer() instanceof NewCustomer);
	}

	@Test(expected = NullPointerException.class)
	public final void testInvalidPayment() {
		try {
			orderObjRef.setPayment(null);
		} catch (NullPointerException e) {
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
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testValidOrderDetail() {
		orderObjRef.setOrderDetail(orderDetailsList);
		assertTrue(orderObjRef.getOrderDetail() instanceof List<?>);
	}

	@Test
	public final void testCalcTax() {
		// Create orderDetail objects
		OrderDetail orderOne = new OrderDetail();
		OrderDetail orderTwo = new OrderDetail();
		OrderDetail orderThree = new OrderDetail();

		// Create item objects
		Item itemOne = new Item();
		Item itemTwo = new Item();
		Item itemThree = new Item();

		orderDetailsList.clear();

		try {
			// Set item prices
			itemOne.setPrice(100);
			itemTwo.setPrice(500);
			itemThree.setPrice(10);

			// Associate item with orderDetails
			orderOne.setItem(itemOne);
			orderTwo.setItem(itemTwo);
			orderThree.setItem(itemThree);

			// Set orderDetail quantities
			orderOne.setQuantity(1);
			orderTwo.setQuantity(5);
			orderThree.setQuantity(10);

			// set orderDetail tax statuses
			orderOne.setTaxStatus(0.2);
			orderTwo.setTaxStatus(0);
			orderThree.setTaxStatus(0.1);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Add individual orders to list
		orderDetailsList.add(orderOne);
		orderDetailsList.add(orderTwo);
		orderDetailsList.add(orderThree);

		// Add list of orders to Order obj
		orderObjRef.setOrderDetail(orderDetailsList);

		assertEquals(30, orderObjRef.calcTax(), 0);
	}

	@Test
	public final void testCalcTotal() {
		// Create orderDetail objects
		OrderDetail orderOne = new OrderDetail();
		OrderDetail orderTwo = new OrderDetail();
		OrderDetail orderThree = new OrderDetail();

		// Create item objects
		Item itemOne = new Item();
		Item itemTwo = new Item();
		Item itemThree = new Item();

		orderDetailsList.clear();

		try {
			// Set item prices
			itemOne.setPrice(100);
			itemTwo.setPrice(500);
			itemThree.setPrice(10);

			// Associate item with orderDetails
			orderOne.setItem(itemOne);
			orderTwo.setItem(itemTwo);
			orderThree.setItem(itemThree);

			// Set orderDetail quantities
			orderOne.setQuantity(1);
			orderTwo.setQuantity(5);
			orderThree.setQuantity(10);

			// set orderDetail tax statuses
			orderOne.setTaxStatus(0.2);
			orderTwo.setTaxStatus(0);
			orderThree.setTaxStatus(0.1);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Add individual orders to list
		orderDetailsList.add(orderOne);
		orderDetailsList.add(orderTwo);
		orderDetailsList.add(orderThree);

		// Add list of orders to Order obj
		orderObjRef.setOrderDetail(orderDetailsList);

		assertEquals(2730, orderObjRef.calcTotal(), 0);
	}

	@Test
	public final void testCalcTotalWeight() {
		// Create orderDetail objects
		OrderDetail orderOne = new OrderDetail();
		OrderDetail orderTwo = new OrderDetail();
		OrderDetail orderThree = new OrderDetail();

		// Create item objects
		Item itemOne = new Item();
		Item itemTwo = new Item();
		Item itemThree = new Item();

		orderDetailsList.clear();

		try {
			// Set item weights & shipping weights
			itemOne.setWeight(8);
			itemTwo.setWeight(450);
			itemThree.setWeight(3);

			itemOne.setShippingWeight(10);
			itemTwo.setShippingWeight(500);
			itemThree.setShippingWeight(5);

			// Associate item with orderDetails
			orderOne.setItem(itemOne);
			orderTwo.setItem(itemTwo);
			orderThree.setItem(itemThree);

			// Set orderDetail quantities
			orderOne.setQuantity(5);
			orderTwo.setQuantity(1);
			orderThree.setQuantity(6);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Add individual orders to list
		orderDetailsList.add(orderOne);
		orderDetailsList.add(orderTwo);
		orderDetailsList.add(orderThree);

		// Add list of orders to Order obj
		orderObjRef.setOrderDetail(orderDetailsList);

		assertEquals(580, orderObjRef.calcTotalWeight(), 0);
	}

}
