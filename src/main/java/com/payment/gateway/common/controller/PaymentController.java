package com.payment.gateway.common.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payment.gateway.common.factory.PaymentProcessFactory;
import com.payment.gateway.common.model.PAYMENT_METHOD;
import com.payment.gateway.common.model.PaymentRequest;
import com.payment.gateway.common.strategy.PaymentStrategy;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
	private final PaymentProcessFactory paymentProcessFactory;

	public PaymentController(PaymentProcessFactory paymentProcessFactory) {
		super();
		this.paymentProcessFactory = paymentProcessFactory;
	}

	@PostMapping("/api/v1/process")
	public String processPayment(@RequestParam PAYMENT_METHOD paymentMethod, @RequestBody PaymentRequest request) {
		log.info("Payment Process API called At: "+ new Date().toString());
		log.info("Selected Payment Gateway Method : "+ paymentMethod);
		
		PaymentStrategy factoryObj=paymentProcessFactory.getPaymentStrategy(paymentMethod.name());
		factoryObj.processPayment(request);
//		try {
//			String encryptedText=JWEUtilsForPartners.jweEncryptAndSign(null, null, normalRequest);
//			factoryObj.processEncryptedPayment(encryptedText);

//		} catch (UnrecoverableKeyException | NoSuchAlgorithmException | CertificateException | KeyStoreException
//				| IOException | JOSEException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return "Payment Successfully completed";
	}
}
