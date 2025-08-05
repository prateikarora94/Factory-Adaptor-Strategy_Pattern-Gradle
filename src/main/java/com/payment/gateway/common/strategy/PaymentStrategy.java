package com.payment.gateway.common.strategy;

import com.payment.gateway.common.model.PaymentRequest;

public interface PaymentStrategy {

	void processPayment(PaymentRequest request);

//	void processEncryptedPayment(String encryptedText);
	
}
