package com.sapient.client.payment;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author spra26
 *
 */
public class Check extends Payment implements Authorization {
	Map<String,String> bankNameIDPair = new HashMap<String,String>();
	
	private String name;
	private String bankID;
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 */
	public void setBank(){
		bankNameIDPair.put("SBI", "State Bank of India");
		bankNameIDPair.put("ICI", "ICICI Bank India");
		bankNameIDPair.put("IOB", "Indian Overseas Bank");
		bankNameIDPair.put("BOI", "Bank of India");
		bankNameIDPair.put("CBI", "Central Bank of India");
		bankNameIDPair.put("ALD", "Allahabad Bank");
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getBankID() {
		return bankID;
	}
	/**
	 * 
	 * @param bankID
	 */
	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	
	
	@Override
	public boolean authorized() {
		boolean flagName,flagBankID;
		
		flagBankID = bankNameIDPair.containsKey(bankID);
		flagName = bankNameIDPair.containsValue(name);
		
		if(flagBankID && flagName){
			return true;
		}
		return false;
		
	}	
}
