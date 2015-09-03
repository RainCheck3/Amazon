package com.sapient.client.test;

import static org.junit.Assert.*;


import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.shop.*;


public class OrderTestCase {
	Order orderObjRef;
	OrderDetail orderDetailObjRef;
	Scanner scannerObjRef;
	NewCustomer newCustomerObjRef;
	Item itemObjRef;
	
	
	@Before
	public void setUp() throws Exception {
		orderObjRef = new Order();
		orderDetailObjRef = new OrderDetail();
		scannerObjRef = new Scanner(System.in);
		newCustomerObjRef  =new NewCustomer();
		itemObjRef = new Item();
		itemObjRef.setPrice(200);
		orderDetailObjRef.setQuantity(2);
		orderDetailObjRef.setTaxStatus(0.11);
		
	}

	@After
	public void tearDown() throws Exception {
		orderDetailObjRef=null;
		orderObjRef= null;
		scannerObjRef=null;
		itemObjRef=null;
	}

	
	@Test
	public final void testCalcTax() {
		//int quantity=orderDetailObjRef.getQuantity();
		//double price=itemObjRef.getPrice();
		double subTotal=orderDetailObjRef.calcSubTotal();
		double taxStatus= orderDetailObjRef.getTaxStatus();
		
		assertEquals(subTotal*taxStatus, orderObjRef.calcTax(),0.001);
		
	}

	@Test
	public final void testCalcTotal() {
		//fail("Not yet implemented");
	}

	@Test
	public final void testCalcTotalWeight() {
		//fail("Not yet implemented");
	}

}
