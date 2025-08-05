package com.payment.gateway.model.axis.status.response;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Axis_data_Status_Response {

	private ArrayList<Axis_Current_Txn_Enq> CUR_TXN_ENQ;
	
	private String errorMessage;
	
	private String checksum;
	
}
