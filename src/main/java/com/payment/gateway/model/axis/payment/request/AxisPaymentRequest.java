package com.payment.gateway.model.axis.payment.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AxisPaymentRequest {

	@NotNull
	private Axis_Data_Payment_Request Data;
	@NotNull
	private Axis_Risk_Payment_Request risk;

	
}
