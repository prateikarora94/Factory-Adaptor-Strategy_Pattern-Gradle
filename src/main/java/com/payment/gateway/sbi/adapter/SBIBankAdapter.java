package com.payment.gateway.sbi.adapter;

import org.springframework.stereotype.Service;

import com.payment.gateway.common.config.MapperUtils;
import com.payment.gateway.common.model.PaymentRequest;
import com.payment.gateway.common.strategy.PaymentStrategy;
import com.payment.gateway.sbi.adaptee.SBIBankAdaptee;
import com.payment.gateway.sbi.model.SBIBankRequest;

@Service("razorpay")
public class SBIBankAdapter implements PaymentStrategy {

	private final SBIBankAdaptee sbiBankAdaptee;
	private final MapperUtils mapper;
	
	public SBIBankAdapter(SBIBankAdaptee sbiBankAdaptee) {
		super();
		this.sbiBankAdaptee = sbiBankAdaptee;
		this.mapper = new MapperUtils();
	}


	@Override
	public void processPayment(PaymentRequest request) {
		SBIBankRequest requestForSBI=mapper.map(request, SBIBankRequest.class);
		sbiBankAdaptee.charge(requestForSBI);
	}


//	@Override
//	public void processEncryptedPayment(String encryptedText) {
//		// TODO Auto-generated method stub
//		
//	}

}
