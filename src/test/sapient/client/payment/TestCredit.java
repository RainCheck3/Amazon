/**
 * 
 */
package test.sapient.client.payment;

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
	Date expiryDate;
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
		expiryDate= new Date(31,12,2018);
		credit.setNumber("51203698");
		credit.setType("Visa");
		credit.setDate(expiryDate);
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
		System.out.println(creditCardType.get(credit.getType()));
		assertTrue(credit.authorizeCreditCardType(credit.getType(), credit.getNumber()));
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorizecreditCardNumber(java.lang.String)}.
	 */
	@Test
	public final void testAuthorizecreditCardNumber() {
		assertTrue(credit.authorizecreditCardNumber(credit.getNumber()));
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorizeCreditCardExpiryDate(java.lang.String, java.util.Date)}.
	 */
	@Test
	public final void testAuthorizeCreditCardExpiryDate() {
		assertTrue(credit.authorizeCreditCardExpiryDate(credit.getNumber(), credit.getDate()));
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorized()}.
	 */
	@Test
	public final void testAuthorized() {
		assertTrue(credit.authorized());
	}

}
