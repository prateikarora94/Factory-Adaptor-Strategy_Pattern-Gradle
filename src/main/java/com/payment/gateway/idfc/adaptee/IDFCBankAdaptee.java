package com.payment.gateway.idfc.adaptee;

import org.springframework.stereotype.Component;

import com.payment.gateway.idfc.model.IDFCBankRequest;

@Component
public class IDFCBankAdaptee {

	public void charge(IDFCBankRequest requestForIDFC)
	{
		System.out.println("Payment throught IDFC");
	}
}
