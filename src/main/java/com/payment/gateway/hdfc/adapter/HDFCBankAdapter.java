package com.payment.gateway.hdfc.adapter;

import org.springframework.stereotype.Service;

import com.payment.gateway.common.config.MapperUtils;
import com.payment.gateway.common.model.PaymentRequest;
import com.payment.gateway.common.strategy.PaymentStrategy;
import com.payment.gateway.hdfc.adaptee.HDFCBankAdaptee;
import com.payment.gateway.hdfc.model.HDFCBankRequest;


@Service("hdfc")
public class HDFCBankAdapter implements PaymentStrategy {

	private final HDFCBankAdaptee adaptee;
	private final MapperUtils mapper;
	
	public HDFCBankAdapter(HDFCBankAdaptee adaptee) {
		this.adaptee = adaptee;
		this.mapper = new MapperUtils();
	}

	@Override
	public void processPayment(PaymentRequest request) {
		HDFCBankRequest requestForHDFC=mapper.map(request, HDFCBankRequest.class);
		adaptee.makePayment(requestForHDFC);
	}

}
