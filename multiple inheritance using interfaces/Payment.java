package com.java.interfaces;

public interface Payment {
	void makePayment();

	default void cancelPayment() {
		System.out.println("transaction failed");
	}

}
