package com.payment.gateway.axis.model.status.response;

import lombok.Data;

@Data
public class Axis_Data_Staus_Response {

	private String status;
	
	private String message;
	
	private Axis_data_Status_Response data;
	
}
