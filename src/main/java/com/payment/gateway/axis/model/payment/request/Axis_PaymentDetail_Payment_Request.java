package com.payment.gateway.axis.model.payment.request;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Axis_PaymentDetail_Payment_Request {

	enum AXIS_TRANSACTION_MODE {

		RT("RTGS"), NE("NEFT"), PA("IMPS"), FT("Fund Transfer (Axis to Axis)"), CC("Corporate Cheques"),
		DD("Demand Draft");

		public final String txnDescription;

		AXIS_TRANSACTION_MODE(String txnModeDes) {
			txnDescription = txnModeDes;
		}
	}

	@NotBlank
	private AXIS_TRANSACTION_MODE txnPaymode;

	@NotBlank
	private String custUniqRef;

	@NotBlank
	private String corpAccNum;

	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date must be in yyyy-MM-dd format")
	@NotBlank
	private String valueDate;

	@Pattern(regexp = "^[0-9]+(\\.[0-9]+)?$", message = "Amount must be a valid decimal number")
	@NotBlank
	private String txnAmount;

	private String beneLEI;
	@NotBlank
	private String beneCode;

	@Pattern(regexp = "^[a-zA-Z ]+$", message = "No Special characters allowed")
	@NotBlank
	private String beneName;
	@NotBlank
	private String beneAccNum;
	private String beneAcType;
	private String beneAddr1;
	private String beneAddr2;
	private String beneAddr3;
	private String beneCity;
	private String beneState;
	private String benePincode;
	private String beneIfscCode;
	private String beneBankName;
	private String baseCode;
	private String chequeNumber;

	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date must be in yyyy-MM-dd format")
	private String chequeDate;
	private String payableLocation;
	private String printLocation;
	private String beneEmailAddr1;
	private String beneMobileNo;
	private String productCode;

	enum TRANSACTION_TYPE {

		CUST("Customer Payment"), MERC("Merchant Payment"), DIST("Distributor Payment"), INTN("Internal Payment"),
		VEND("Vendor Payment");

		public final String txnType;

		private TRANSACTION_TYPE(String txnType) {
			this.txnType = txnType;
		}

	}

	@NotBlank
	private TRANSACTION_TYPE txnType;

	private List<Axis_InvoiceDetail_Payment_Request> invoiceDetails;

	private String enrichment1;
	private String enrichment2;
	private String enrichment3;
	private String enrichment4;
	private String enrichment5;

	private String senderToReceiverInfo;
}
