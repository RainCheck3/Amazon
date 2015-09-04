/**
 * 
 */
package com.sapient.client.test;


import com.sapient.client.payment.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author spra26
 *
 */
public class TestCash {
	Cash cash;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cash = new Cash();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Cash#setCashTendered(double)}.
	 * @throws Exception 
	 */
	@Test
	public final void testSetCashTendered() throws Exception {
		cash.setCashTendered(100);
		assertEquals(cash.getCashTendered(), cash);
	}

}
