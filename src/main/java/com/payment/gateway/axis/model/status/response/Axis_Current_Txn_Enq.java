package com.payment.gateway.axis.model.status.response;

import lombok.Data;

@Data
public class Axis_Current_Txn_Enq {

	private String statusDescription;
	
	private String batchNo;
	
	private String transactionStatus;

	private String processingDate;
	
	private String corpCode;
	
	private String crn;
	
	private String utrNo;
	
	private String responeCode;
	
	private String message;
	
}
