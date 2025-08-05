package com.payment.gateway.axis.model.status.request;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Axis_Data_Staus_Request {


	private String channelId;
	
	private String corpCode;
	
	private ArrayList<String> crn;
	
	private String checksum;
	

}
