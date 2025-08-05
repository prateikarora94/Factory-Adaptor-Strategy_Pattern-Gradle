package com.payment.gateway.model.common;

import lombok.Data;

@Data
public class PaymentRequest {

	private double amount;

	private String description;

	
}
