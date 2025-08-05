package com.payment.gateway.hdfc.adaptee;

import org.springframework.stereotype.Component;

import com.payment.gateway.hdfc.model.HDFCBankRequest;

@Component
public class HDFCBankAdaptee {

	public void makePayment(HDFCBankRequest requestForHDFC)
	{
		System.out.println("Payment through HDFC");
	}
}
