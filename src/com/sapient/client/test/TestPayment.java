/**
 * 
 */
package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.payment.Payment;

/**
 * @author spra26
 *
 */
public class TestPayment {
	Payment payment;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		payment = new Payment();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Payment#setOrderObjRef(com.sapient.client.shop.Order)}.
	 */
	@Test
	public final void testSetOrderObjRef() {
		
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Payment#setAmountPaid(double)}.
	 */
	@Test
	public final void testSetAmountPaid() {
		payment.setAmountPaid(100);
		assertEquals(payment.getAmountPaid(), 100, 1.00);
		assertNotEquals(payment.getAmountPaid(), 110, 1.00);
	}

}
