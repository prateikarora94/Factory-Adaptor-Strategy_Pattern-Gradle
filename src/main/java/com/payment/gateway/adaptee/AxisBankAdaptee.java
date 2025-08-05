package com.payment.gateway.adaptee;

import org.springframework.stereotype.Component;

import com.payment.gateway.model.axis.payment.request.AxisPaymentRequest;

@Component
public class AxisBankAdaptee {

	public void pay(AxisPaymentRequest request)
	{
		System.out.println("Payment through Paypal");
	}
}
