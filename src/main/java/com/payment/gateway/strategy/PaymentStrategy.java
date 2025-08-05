package com.payment.gateway.strategy;

import com.payment.gateway.model.common.PaymentRequest;

public interface PaymentStrategy {

	void processPayment(PaymentRequest request);
	
}
