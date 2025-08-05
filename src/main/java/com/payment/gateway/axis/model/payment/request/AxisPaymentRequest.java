package com.payment.gateway.axis.model.payment.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AxisPaymentRequest {

	@NotNull
	private Axis_Data_Payment_Request Data;
	@NotNull
	private Axis_Risk_Payment_Request risk;

	
}
