package com.sapient.client.payment;


/**
 * 
 * @author spra26
 *
 */
public class Check extends Payment implements Authorization {
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
		
		
		
		
		
		return true;
		
		 
		
	}
	
	
	
}
