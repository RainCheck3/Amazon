package com.sapient.client.payment;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author spra26
 *
 */
public class Check extends Payment implements Authorization {
	Map<String,String> bankNameIDPair = new HashMap<String,String>();//HashMap containing Bank ID and Bank Name.
	
	private String name;
	private String bankID;
	
	/**
	 * This method gets bank name.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method set Banks Name with Bank ID in Hash Map.
	 */
	public void setBank(){
		bankNameIDPair.put("SBI", "State Bank of India");
		bankNameIDPair.put("ICI", "ICICI Bank");
		bankNameIDPair.put("IOB", "Indian Overseas Bank");
		bankNameIDPair.put("BOI", "Bank of India");
		bankNameIDPair.put("CBI", "Central Bank of India");
		bankNameIDPair.put("ALD", "Allahabad Bank");
	}
	/**
	 * This method sets bank name.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method gets Bank ID.
	 * @return bankID
	 */
	public String getBankID() {
		return bankID;
	}
	/**
	 * This method sets BankID
	 * @param bankID
	 */
	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	
	/**
	 * This method authorize whether such bankID and bankName exist.
	 * This method overrides authorize() method from Authorization Interface in same Package.
	 */
	@Override
	public boolean authorized() {
		boolean flagName,flagBankID;
		
		flagBankID = bankNameIDPair.containsKey(bankID);// sets true if such Bank ID exist.
		flagName = bankNameIDPair.containsValue(name);// sets true if such Bank Name exist.
		
		if(flagBankID && flagName){
			return true;
		}
		return false;
		
	}	
}
