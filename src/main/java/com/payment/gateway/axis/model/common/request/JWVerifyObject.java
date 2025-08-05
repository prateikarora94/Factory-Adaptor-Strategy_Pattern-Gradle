package com.payment.gateway.axis.model.common.request;

import lombok.Data;

@Data
public class JWVerifyObject {

	private Boolean isSignatureValid=false;
	
	private String payloadAfterVerification;
	
}
