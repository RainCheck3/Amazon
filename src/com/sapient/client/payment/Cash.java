package com.sapient.client.payment;

public class Cash extends Payment {
	private double cashTendered;

	public double getCashTendered() {
		return cashTendered;
	}

	public void setCashTendered(double cashTendered) {
		this.cashTendered = cashTendered;
	}
}
