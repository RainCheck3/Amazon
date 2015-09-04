package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.shop.*;



public class ItemTestCase {
	
static OrderDetail orderDetailObjRef ;
static Item itemObjRef;
static boolean thrown;
	

	@Before
	public void setUp() throws Exception {
		orderDetailObjRef= new OrderDetail();
		itemObjRef = new Item();
		 thrown=false;
	}

	@After
	public void tearDown() throws Exception {
		orderDetailObjRef= null;
		itemObjRef=null;
	}

	@Test
	public final void testInValidItemName() {
		
		
		try {
			itemObjRef.setItemName("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertTrue(thrown);
	}

	
	@Test
	public final void testValidItemName() {

		
		try {
			itemObjRef.setItemName("mouse");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertFalse(thrown);
	}
	

	@Test
	public final void testInValidPrice() {

		
		try {
			itemObjRef.setPrice(0);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertTrue(thrown);
	
	}

	@Test
	public final void testValidPrice() {

		
		try {
			itemObjRef.setPrice(200);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertFalse(thrown);
	}
	

	@Test
	public final void testInValidShippingWeight() {

		
		try {
			itemObjRef.setWeight(25);
			
			itemObjRef.setShippingWeight(itemObjRef.getWeight());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertTrue(thrown);
	
	}

	@Test
	public final void testValidShippingWeight() {

		
		try {
			itemObjRef.setWeight(25);
			
			itemObjRef.setShippingWeight(itemObjRef.getWeight()+20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertFalse(thrown);
		
	}

	@Test
	public final void testInValidDescription() {

		
		try {
			
			
			itemObjRef.setDescription("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertTrue(thrown);
	
	}

	@Test
	public final void testValidDescription() {

		
		try {
			
			
			itemObjRef.setDescription("name of the product is mouse and the price of the product is  200. the company of product is iball.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertFalse(thrown);	
	}

	@Test
	public final void testInValidOrderDetail() {

		
		try {
			
			
			itemObjRef.setOrderDetail(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertTrue(thrown);
	
	}

	@Test
	public final void testValidOrderDetail() {

		try {
			
			
			itemObjRef.setOrderDetail(orderDetailObjRef);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertFalse(thrown);
		
	}

	@Test
	public final void testInValidWeight() {

		
		try {
			
			
			itemObjRef.setWeight(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertTrue(thrown);
	
	}

	@Test
	public final void testValidWeight() {

		
		try {
			
			
			itemObjRef.setWeight(200);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			thrown=true;
		}
		assertFalse(thrown);
	
	}

}
