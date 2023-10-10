package com.java.interfaces;

public class PaymentDriver {
	public static void main(String[] args) {
		PhonePay phonePay = new PhonePay();
		phonePay.makePayment();
		phonePay.cancelPayment();
		phonePay.checkBalance();
	}

}
