package com.payment.gateway.adapter;

import org.springframework.stereotype.Service;

import com.payment.gateway.adaptee.SBIBankAdaptee;
import com.payment.gateway.config.MapperUtils;
import com.payment.gateway.model.common.PaymentRequest;
import com.payment.gateway.model.idfc.IDFCBankRequest;
import com.payment.gateway.strategy.PaymentStrategy;


@Service("stripe")
public class HDFCBankAdapter implements PaymentStrategy {

	private final SBIBankAdaptee adaptee;
	private final MapperUtils mapper;
	
	public HDFCBankAdapter(SBIBankAdaptee adaptee) {
		this.adaptee = adaptee;
		this.mapper = new MapperUtils();
	}

	@Override
	public void processPayment(PaymentRequest request) {
		IDFCBankRequest requestForStripe=mapper.map(request, IDFCBankRequest.class);
		adaptee.charge(requestForStripe);
	}

}
