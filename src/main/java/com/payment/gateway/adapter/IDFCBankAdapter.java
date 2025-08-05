package com.payment.gateway.adapter;

import org.springframework.stereotype.Service;

import com.payment.gateway.adaptee.HDFCBankAdaptee;
import com.payment.gateway.config.MapperUtils;
import com.payment.gateway.model.common.PaymentRequest;
import com.payment.gateway.model.hdfc.HDFCBankRequest;
import com.payment.gateway.strategy.PaymentStrategy;

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

}
