package com.payment.gateway.adapter;

import org.springframework.stereotype.Service;

import com.payment.gateway.adaptee.AxisBankAdaptee;
import com.payment.gateway.config.MapperUtils;
import com.payment.gateway.model.axis.payment.request.AxisPaymentRequest;
import com.payment.gateway.model.common.PaymentRequest;
import com.payment.gateway.strategy.PaymentStrategy;

@Service("axis")
public class AxisBankAdapter implements PaymentStrategy {

	private final AxisBankAdaptee axisBankAdaptee;
	private final MapperUtils mapper;
	
	public AxisBankAdapter(AxisBankAdaptee paypalAdaptee) {
		super();
		this.axisBankAdaptee = paypalAdaptee;
		this.mapper = new MapperUtils();
	}

	@Override
	public void processPayment(PaymentRequest request) {
		AxisPaymentRequest requestForAxis=mapper.map(request, AxisPaymentRequest.class);
		axisBankAdaptee.pay(requestForAxis);
	}

}
