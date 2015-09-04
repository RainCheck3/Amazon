package com.sapient.client.payment;

import com.sapient.client.shop.Order;


class InValidAmountException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		Order order= new Order();
		
		if(amountPaid>=order.calcTotal()){
		
		this.cashTendered = amountPaid;
	}
		else{
			throw new InValidAmountException("Amount paid is less than total cost of order.");
		}
		
	}
	
	
	
}
