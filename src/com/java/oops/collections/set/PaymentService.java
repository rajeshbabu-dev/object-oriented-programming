package com.java.oops.collections.set;

import com.java.oops.model.Payment;

public class PaymentService {
    public void displayPayment(Payment payment) {
        System.out.println("Payment Details:");
        System.out.println("Transaction Id : " + payment.getTransactionId());
        System.out.println("Date : " + payment.getDate());
        System.out.println("Payment Amount : " + payment.getPaymentAmount());
        System.out.println("Mode of payment : " + payment.getModeOfPayment());
        System.out.println();
    }

}
