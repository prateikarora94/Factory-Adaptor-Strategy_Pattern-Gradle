package com.payment.gateway.model.axis.payment.response;

import lombok.Data;

@Data
public class AxisPaymentResponse {

	private Axis_Data_Payment_Response Data;

	private Axis_Risk_Payment_Response Risk;

	private Axis_Link_Payment_Response Link;

	private Axis_Meta_Payment_Response Meta;

}
