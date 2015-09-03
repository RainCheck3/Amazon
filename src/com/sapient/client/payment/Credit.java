package com.sapient.client.payment;

import java.util.Calendar;
import java.util.Date;

public class Credit extends Payment implements Authorization {

	private int number;
	private String type;
	private Date date;
	
	
	


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 *  This methods checks for all validity of Credit Card Number, Type, Expire Date.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public boolean authorized() {
		// TODO Auto-generated method stub
		Integer number=  this.number;
		String numberInString = number.toString();
		int length = numberInString.length();
		
		if(length != 8){
			return false;
		}
		
		
		String notStartCharacter= "0";
		if(numberInString.startsWith(notStartCharacter)){
			return false;	
		}
		
		Calendar calender =Calendar.getInstance();
		int year = calender.get(Calendar.YEAR);
		int month = calender.get(Calendar.MONTH);
		int date = calender.get(Calendar.DATE);
		Date currentDate = new Date(year, month, date);
		
		if( currentDate.before(this.date)){
			return false;
		}
		
		return true;
	}
	

}
