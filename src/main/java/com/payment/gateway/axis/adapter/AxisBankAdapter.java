package com.payment.gateway.axis.adapter;

import org.springframework.stereotype.Service;

import com.payment.gateway.axis.adaptee.AxisBankAdaptee;
import com.payment.gateway.axis.model.payment.request.AxisPaymentRequest;
import com.payment.gateway.common.config.MapperUtils;
import com.payment.gateway.common.model.PaymentRequest;
import com.payment.gateway.common.strategy.PaymentStrategy;

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
