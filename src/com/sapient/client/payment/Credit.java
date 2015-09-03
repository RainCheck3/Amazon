package com.sapient.client.payment;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author Shivam
 *
 */
public class Credit extends Payment implements Authorization {

	private int number;
	private String type;
	private Date date;
	
	
	
	/**
	 * This methods gets credit card number.
	 * @return
	*/
	public int getNumber() {
		return number;
	}

	/**
	 * This methods sets credit card number.
	 * @param number
	*/
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * This methods gets credit card Type.
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * This methods sets credit card Type.
	 * @param type
	*/
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This methods gets credit card ecpire date.
	 * @return
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * This methods sets credit card expire date.
	 * @param date
	*/
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 *  This methods checks for all validity of Credit Card Number, Type, Expire Date.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public boolean authorized() {
		Integer number=  this.number;
		String numberInString = number.toString();
		int length = numberInString.length();
		
		/**
		 *  This is to check credit card should contain exactly 8 digits.
		 *   I assumed this norm from my side
		 *   It can be replaced with real norms if required.
		 *  
		 */
		if(length != 8){
			return false;
		}
		
		/**
		 * This is to check credit card number should not start with zero.
		 */
		String notStartCharacter= "0";
		if(numberInString.startsWith(notStartCharacter)){
			return false;	
		}
		/**
		 * This is to check credit card expire date is later than current date.
		 */
		Calendar calender =Calendar.getInstance();//New instance of calendar class.
		int year = calender.get(Calendar.YEAR);// Fetches current year.
		int month = calender.get(Calendar.MONTH);// Fetches current month.
		int date = calender.get(Calendar.DATE);// Fetches current date.
		Date currentDate = new Date(year, month, date);// New date object with  current date.
		
		if( currentDate.before(this.date)){
			return false;
		}
		
		return true;//returns true as not condition has turned false.
	}
	

}
