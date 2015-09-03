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
	
	
	@Before
	public void setUp() throws Exception {
		orderObjRef = new Order();
		orderDetailObjRef = new OrderDetail();
		scannerObjRef = new Scanner(System.in);
		
	}

	@After
	public void tearDown() throws Exception {
		orderDetailObjRef=null;
		orderObjRef= null;
		scannerObjRef=null;
	}

	@Test
	public final void testCalcTax() {
		
	}

	@Test
	public final void testCalcTotal() {
		fail("Not yet implemented");
	}

	@Test
	public final void testCalcTotalWeight() {
		fail("Not yet implemented");
	}

}
