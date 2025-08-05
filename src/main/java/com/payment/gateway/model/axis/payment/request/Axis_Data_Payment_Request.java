package com.payment.gateway.model.axis.payment.request;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Axis_Data_Payment_Request {

	@Size(max = 12, message = "channelId must be 12 characters max")
	@NotNull
	private String channelId;

	@Size(max = 15, message = "corpCode must be 15 characters max")
	@NotNull
	private String corpCode;

	private List<Axis_PaymentDetail_Payment_Request> paymentDetails;

	@Size(max = 500, message = "checksum must be 15 characters max")
	@NotNull
	private String checksum;


}
