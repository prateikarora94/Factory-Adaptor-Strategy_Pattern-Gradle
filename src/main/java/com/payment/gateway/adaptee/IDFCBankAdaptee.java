package com.payment.gateway.adaptee;

import org.springframework.stereotype.Component;

import com.payment.gateway.model.idfc.IDFCBankRequest;

@Component
public class IDFCBankAdaptee {

	public void charge(IDFCBankRequest requestForStripe)
	{
		System.out.println("Payment throught Stripe");
	}
}
