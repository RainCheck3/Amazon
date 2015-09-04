/**
 * 
 */
package test.sapient.client.payment;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.payment.Check;

/**
 * @author spra26
 *
 */
public class TestCheck {
	public static Map<String,String> bankNameIDPair = new HashMap<String,String>();
	String bankName="State Bank of India";
	Check check = new Check();
	
	public static void setBank(){
		bankNameIDPair.put("SBI", "State Bank of India");
		bankNameIDPair.put("ICI", "ICICI Bank");
		bankNameIDPair.put("IOB", "Indian Overseas Bank");
		bankNameIDPair.put("BOI", "Bank of India");
		bankNameIDPair.put("CBI", "Central Bank of India");
		bankNameIDPair.put("ALD", "Allahabad Bank");
	}
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		check.setName("State Bank of India");
		check.setBankID("SBI");
		TestCheck.setBank();
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
