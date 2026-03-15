package com.java.oops.model;

public class Main {
    static void main(String[] args) {
        Payment payment = new Payment();
        payment.setTransactionId(102011)
                .setDate("12/2/2026")
                .setPaymentAmount(1980)
                .setModeOfPayment("giftCard");


//        System.out.println("Payment Details :");
//        System.out.println("Transaction Id : " + payment.getTransactionId());
//        System.out.println("Date Of Payment : " + payment.getDate());
//        System.out.println("Amont Paid : " + payment.getPaymentAmount());
//        System.out.println("Mode Of Payment : " + payment.getModeOfPayment());
        System.out.println(payment);


    }
}
