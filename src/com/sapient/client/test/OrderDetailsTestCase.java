package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.client.shop.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderDetailsTestCase {
	
	static Order orderObjRef;
	static Item itemObjRef;
	static OrderDetail orderDetailsObjRef;
	
	
	static Map<String, List<String>> item;
	static List<String> itemDetail;
	
	
	@Before
	public void setUp() throws Exception {
		orderObjRef= new Order();
		orderDetailsObjRef = new OrderDetail();
		itemObjRef= new Item();
		item=new HashMap<String, List<String>>();
		itemDetail= new ArrayList<String>();
		
		
	}

	@After
	public void tearDown() throws Exception {
		orderDetailsObjRef=null;
		orderObjRef=null;
		itemObjRef =null;
	}

	@Test
	public final void testGetQuantity() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetQuantity() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetTaxStatus() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetTaxStatus() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetOrder() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetOrder() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetItem() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetItem() {
		fail("Not yet implemented");
	}

	@Test
	public final void testCalcSubTotal() {
		fail("Not yet implemented");
	}

	@Test
	public final void testCalcWeight() {
		fail("Not yet implemented");
	}

}
