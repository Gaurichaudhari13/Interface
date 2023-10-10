package com.java.interfaces;

public class PhonePay extends BalanceInquiry implements Payment, Transaction {

	@Override
	public void printTransaction() {
		System.out.println("transaction via phonepay");
	}

	@Override
	public void makePayment() {
		System.out.println("payment via phonepay");
	}

	@Override
	public void checkBalance() {
		System.out.println("balance check via phonepay");

	}

}
