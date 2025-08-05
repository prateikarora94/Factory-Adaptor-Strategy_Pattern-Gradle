package com.payment.gateway.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.payment.gateway.strategy.PaymentStrategy;

@Component
public class PaymentProcessFactory {

	@Autowired
	private ApplicationContext applicationContext;

	public PaymentStrategy getPaymentStrategy(String paymentMethod) {

		try {
			return (PaymentStrategy) applicationContext.getBean(paymentMethod.toLowerCase());
		} catch (BeansException e) {
			throw new IllegalArgumentException("Invalid payment method: " + paymentMethod, e);
		}
	}
}
