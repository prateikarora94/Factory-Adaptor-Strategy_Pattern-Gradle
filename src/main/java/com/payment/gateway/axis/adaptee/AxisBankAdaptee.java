package com.payment.gateway.axis.adaptee;

import org.springframework.stereotype.Component;

import com.payment.gateway.axis.model.payment.request.AxisPaymentRequest;

@Component
public class AxisBankAdaptee {

	public void pay(AxisPaymentRequest request)
	{
		System.out.println("Payment through Axis Bank");
	}
}
