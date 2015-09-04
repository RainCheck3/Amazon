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

public class CustomerTestCases {
	static Order orderObjRef;
	static OrderDetail orderDetailObjRef;
	static NewCustomer newCustomerObjRef;
	static Item itemObjRef;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		orderObjRef = new Order();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public final void test() {
		fail("Not yet implemented");
	}

}
