/**
 * 
 */
package test.sapient.client.payment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.payment.Check;

/**
 * @author spra26
 *
 */
public class TestCheck {

	String bankName="State Bank of India";
	Check check = new Check();
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		check.setName("State Bank of India");
		check.setBankID("SBI");
		check.setBank();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		check = null;
	}


	/**
	 * Test method for {@link com.sapient.client.payment.Check#authorized()}.
	 */
	@Test
	public final void testAuthorized() {
		
		assertTrue(check.authorized());
	}
	
	
}
