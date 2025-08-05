package com.payment.gateway.adaptee;

import org.springframework.stereotype.Component;

import com.payment.gateway.model.hdfc.HDFCBankRequest;

@Component
public class HDFCBankAdaptee {

	public void makePayment(HDFCBankRequest requestForPaypal)
	{
		System.out.println("Payment through RazorPay");
	}
}
