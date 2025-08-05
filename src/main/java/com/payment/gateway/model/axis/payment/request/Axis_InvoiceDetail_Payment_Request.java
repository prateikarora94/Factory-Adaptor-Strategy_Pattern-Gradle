package com.payment.gateway.model.axis.payment.request;

import lombok.Data;

@Data
public class Axis_InvoiceDetail_Payment_Request {
	private String invoiceAmount;
	private String invoiceNumber;
	private String invoiceDate;
	private String cashDiscount;
	private String tax;
	private String netAmount;
	private String invoiceInfo1;
	private String invoiceInfo2;
	private String invoiceInfo3;
	private String invoiceInfo4;
	private String invoiceInfo5;
}
