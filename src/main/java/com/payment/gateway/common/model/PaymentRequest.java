package com.payment.gateway.common.model;

import lombok.Data;

@Data
public class PaymentRequest {

	private double amount;

	private String description;

	
}
