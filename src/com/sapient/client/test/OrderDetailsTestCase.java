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
	static Item itemObjRef1,itemObjRef2,itemObjRef3,itemObjRef4;
	static OrderDetail orderDetailsObjRef;
	
	
	static Map<String, List<String>> item;
	static List<String> itemDetail;
	private Object quantity;
	private Object taxStatus;
	//static Map<String, List<Item>> item;
	static List<Item> itemDetail;
	
	
	@Before
	public void setUp() throws Exception {
		orderObjRef= new Order();
		orderDetailsObjRef = new OrderDetail();
		itemObjRef1= new Item();
		itemObjRef2= new Item();
		itemObjRef3= new Item();
		itemObjRef4= new Item();
	//	item=new HashMap<String, List<Item>>();
		itemDetail= new ArrayList<Item>();
		
		itemObjRef1.setDescription("name of the product is mouse and the price of the product is  300. the company of product is iball.");
		itemObjRef1.setItemName("mouse");
		itemObjRef1.setPrice(300);
		itemObjRef1.setShippingWeight(250);
		itemObjRef1.setWeight(100);
		
		itemObjRef1.setDescription("name of the product is keyboard and the price of the product is  400. the company of product is iball.");
		itemObjRef1.setItemName("keyboard");
		itemObjRef1.setPrice(400);
		itemObjRef1.setShippingWeight(350);
		itemObjRef1.setWeight(200);
		
		itemDetail.add(itemObjRef1);
		itemDetail.add(itemObjRef2);
	//	item.put("mouse",itemDetail);
		
	}

	@After
	public void tearDown() throws Exception {
		orderDetailsObjRef=null;
		orderObjRef=null;
		itemObjRef1 =null;
		itemObjRef2 =null;
	}

	@Test
	public final void testGetQuantity() {
		//fail("Not yet implemented");
	}

	
	@Test
	public final void testValidQuantity() {
		
	}

	@Test
	public final void testInvalidTaxStatus() {
		double taxStatus = orderDetailsObjRef.getTaxStatus();
		if (taxStatus == 0) {
			throw new NullPointerException();
		} else {
			this.taxStatus = quantity;
		}
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
		double quantity=0;
		assertEquals(quantity*itemDetail.get(0).getPrice(),0,0.00);
		
	}

	@Test
	public final void testCalcWeight() {
		double quantity=0;
		assertEquals(quantity*itemDetail.get(0).getShippingWeight(),0,0.00);
		
	}

}
