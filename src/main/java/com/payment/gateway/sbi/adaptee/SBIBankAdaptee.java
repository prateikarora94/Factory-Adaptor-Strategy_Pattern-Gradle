package com.payment.gateway.sbi.adaptee;

import org.springframework.stereotype.Component;

import com.payment.gateway.sbi.model.SBIBankRequest;

@Component
public class SBIBankAdaptee {

	public void charge(SBIBankRequest requestForSBI)
	{
		System.out.println("Payment throught SBI");
	}

}
