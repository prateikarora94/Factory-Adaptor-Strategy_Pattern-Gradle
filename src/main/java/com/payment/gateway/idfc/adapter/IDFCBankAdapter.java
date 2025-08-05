package com.payment.gateway.idfc.adapter;

import org.springframework.stereotype.Service;

import com.payment.gateway.common.config.MapperUtils;
import com.payment.gateway.common.model.PaymentRequest;
import com.payment.gateway.common.strategy.PaymentStrategy;
import com.payment.gateway.hdfc.adaptee.HDFCBankAdaptee;
import com.payment.gateway.hdfc.model.HDFCBankRequest;

@Service("razorpay")
public class IDFCBankAdapter implements PaymentStrategy {

	private final HDFCBankAdaptee razorPayAdaptee;
	private final MapperUtils mapper;
	
	public IDFCBankAdapter(HDFCBankAdaptee razorPayAdaptee) {
		super();
		this.razorPayAdaptee = razorPayAdaptee;
		this.mapper = new MapperUtils();
	}


	@Override
	public void processPayment(PaymentRequest request) {
		HDFCBankRequest requestForPaypal=mapper.map(request, HDFCBankRequest.class);
		razorPayAdaptee.makePayment(requestForPaypal);
	}


//	@Override
//	public void processEncryptedPayment(String encryptedText) {
//		// TODO Auto-generated method stub
//		
//	}

}
