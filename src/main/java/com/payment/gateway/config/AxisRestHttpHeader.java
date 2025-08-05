package com.payment.gateway.config;

public enum AxisRestHttpHeader {

	epoch("x-fapi-epoch-millis"),
	channelId("x-fapi-channel-id"),
	uuId("x-fapi-uuid"),
	serviceId("x-fapi-serviceId"),
	serviceVersion("x-fapi-serviceVersion"),
	clientId("X-IBM-Client-Id"),
	clientSecret("X-IBM-Client-Secret");

	public final String headerData;

	AxisRestHttpHeader(String headerName) {
		headerData = headerName;

	}
	
	
}
