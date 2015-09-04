package com.sapient.client.payment;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Shivam,Jiaxu,Mohit
 *
 */
public class Credit extends Payment implements Authorization {

	private String number;
	private String type;
	private Date date;

	Map<String, String> creditCardType = new HashMap<String, String>();

	public void creditCardType() {
		creditCardType.put("Visa", "5120");
		creditCardType.put("Master", "4186");
		creditCardType.put("Mastero", "7890");
		creditCardType.put("American Express", "1236");
		creditCardType.put("Dscover", "9512");
		creditCardType.put("Solo", "6052");
	}

	/**
	 * This methods gets credit card number.
	 * @return number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * This methods sets credit card number.
	 * 
	 * @param number
	 */
	public String setNumber(String number) {
		return this.number = number;
	}

	/**
	 * This methods gets credit card Type.
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * This methods sets credit card Type.
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This methods gets credit card ecpire date.
	 * 
	 * @return date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * This methods sets credit card expire date.
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	public boolean authorizeCreditCardType(String type, String number) {

		/**
		 * This checks whether credit card number is consistent with its type or
		 * not.
		 */
		if (number.substring(0, 3).equals(creditCardType.get(type))) {
			return true;
		}
		return false;

	}

	
	public boolean authorizecreditCardNumber(String number){
		int length = number.length();

		/**
		 * This is to check credit card should contain exactly 8 digits. I
		 * assumed this norm from my side It can be replaced with real norms if
		 * required.
		 * 
		 */
		if (length != 8) {
			return false;
		}
		
		/**
		 * This is to check credit card number should not start with zero.
		 */
		String notStartCharacter = "0";
		if (number.startsWith(notStartCharacter)) {
			return false;
		}
		
		return true;
	}
	
	public boolean authorizeCreditCardExpiryDate(String number, Date expriyDate){
		
		/**
		 * This is to check credit card expire date is later than current date.
		 */
		Calendar calender = Calendar.getInstance();// New instance of calendar
													// class.
		int year = calender.get(Calendar.YEAR);// Fetches current year.
		int month = calender.get(Calendar.MONTH);// Fetches current month.
		int date = calender.get(Calendar.DATE);// Fetches current date.
		@SuppressWarnings("deprecation")
		Date currentDate = new Date(year, month, date);// New date object with
														// current date.

		if (currentDate.before(this.date)) {
			return false;
		}
		
		
		return true;
		
	}
	
	/**
	 * This methods checks for all validity of Credit Card Number, Type, Expire
	 * Date.
	 */
	@Override
	public boolean authorized() {
	
		if (!authorizecreditCardNumber(number)) {
			return false;
		}
		
		
		if (!authorizeCreditCardExpiryDate(number, date)) {
			return false;
		}
		

		if (!authorizeCreditCardType(type, number)) {
			return false;
		}

		return true;// returns true as not condition has turned false.
	}

}
