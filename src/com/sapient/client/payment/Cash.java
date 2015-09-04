package com.sapient.client.payment;

import javax.activity.InvalidActivityException;

import com.sapient.client.shop.Order;


class InValidAmountException extends Exception
{
    public InValidAmountException(String message)
    {
        super(message);
    }
}



public class Cash extends Payment {
	private double cashTendered;

	public double getCashTendered() {
		return cashTendered;
	}

	public void setCashTendered(double amountPaid) throws Exception {
		Order orderObjRef= getOrderObjRef();
		
		if(amountPaid>=orderObjRef.calcTotal()){
		
		this.cashTendered = amountPaid;
	}
		else{
			throw new InValidAmountException("Amount paid is less than total cost of order.");
		}
		
	}
	
	
	
}
