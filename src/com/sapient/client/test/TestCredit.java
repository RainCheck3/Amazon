/**
 * 
 */
package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.payment.Credit;

/**
 * @author spra26
 *
 */
public class TestCredit {
	Credit credit;
	Credit creditFalse;
	Credit creditTest;
	Date expiryDate;
	Date expiryDateFalse;
	public static Map<String, String> creditCardType = new HashMap<String, String>();
	
	
	public static void creditCardType() {
		creditCardType.put("Visa", "5120");
		creditCardType.put("Master", "4186");
		creditCardType.put("Mastero", "7890");
		creditCardType.put("American Express", "1236");
		creditCardType.put("Dscover", "9512");
		creditCardType.put("Solo", "6052");
	}
	/**
	 * @throws java.lang.Exception
	 */
	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception {
		credit = new Credit();
		creditFalse= new Credit();
		creditTest = new Credit();
		expiryDate= new Date(31,12,2018);
		expiryDateFalse= new Date(1,8,2015);
		credit.setNumber("51203698");
		credit.setType("Visa");
		credit.setDate(expiryDate);
		creditFalse.setNumber("5120369");
		creditFalse.setType("Master");
		creditFalse.setDate(expiryDateFalse);
		TestCredit.creditCardType();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorizeCreditCardType(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testAuthorizeCreditCardType() {
		assertTrue(credit.authorizeCreditCardType(credit.getType(), credit.getNumber()));
		assertFalse(creditFalse.authorizeCreditCardType(creditFalse.getType(), creditFalse.getNumber()));
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorizecreditCardNumber(java.lang.String)}.
	 */
	@Test
	public final void testAuthorizecreditCardNumber() {
		assertTrue(credit.authorizecreditCardNumber(credit.getNumber()));
		assertFalse(creditFalse.authorizecreditCardNumber(creditFalse.getNumber()));
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorizeCreditCardExpiryDate(java.lang.String, java.util.Date)}.
	 */
	@Test
	public final void testAuthorizeCreditCardExpiryDate() {
		creditFalse.setNumber("51203691");
		creditFalse.setType("Visa");
		creditFalse.setDate(expiryDateFalse);
		assertTrue(credit.authorizeCreditCardExpiryDate(credit.getNumber(), credit.getDate()));
		assertFalse(creditFalse.authorizeCreditCardExpiryDate(creditFalse.getNumber(), creditFalse.getDate()));
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorized()}.
	 */
	@Test
	public final void testAuthorized() {
		assertTrue(credit.authorized());
		assertFalse(credit.authorized());
	}
	
	@Test
	public final void testSetNumber() {
		String number="123456678";
		creditTest.setNumber(number);
		assertEquals(creditTest.getNumber(), number );
	}
	
	@Test
	public final void testSetType() {
		String type="123456678";
		creditTest.setType(type);
		assertEquals(creditTest.getType(), type );
	}
	

	@Test
	public final void testSetExpDate() {
		@SuppressWarnings("deprecation")
		Date date=new Date(12,12,2010);
		creditTest.setDate(date);
		assertEquals(creditTest.getDate(), date );
	}
	
	
	

}
