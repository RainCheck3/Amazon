/**
 * 
 */
package test.sapient.client.payment;

import static org.junit.Assert.*;

import java.util.Date;

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
		credit.creditCardType();
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
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorizecreditCardNumber(java.lang.String)}.
	 */
	@Test
	public final void testAuthorizecreditCardNumber() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorizeCreditCardExpiryDate(java.lang.String, java.util.Date)}.
	 */
	@Test
	public final void testAuthorizeCreditCardExpiryDate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.payment.Credit#authorized()}.
	 */
	@Test
	public final void testAuthorized() {
		assertTrue(credit.authorized());
	}

}
