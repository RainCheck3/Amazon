package com.sapient.client.payment;

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


	@Override
	public void authorized() {
		// TODO Auto-generated method stub
		
	}
	

}
