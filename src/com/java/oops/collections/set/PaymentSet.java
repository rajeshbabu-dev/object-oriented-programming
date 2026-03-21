package com.java.oops.collections.set;

import com.java.oops.model.Payment;

import java.util.HashSet;
import java.util.Iterator;

public class PaymentSet {
    static void main(String[] args) {
        HashSet<Payment> payments = new HashSet<>();
        Payment payment1 = new Payment();
        payment1.setTransactionId(102210).setDate("12/2/2026").setPaymentAmount(999).setModeOfPayment("giftcards");
        Payment payment2 = new Payment();
        payment2.setTransactionId(102211).setDate("13/2/2026").setPaymentAmount(1500).setModeOfPayment("credit card");
        Payment payment3 = new Payment();
        payment3.setTransactionId(102212).setDate("14/2/2026").setPaymentAmount(750).setModeOfPayment("upi");
        Payment payment4 = new Payment();
        payment4.setTransactionId(102213).setDate("15/2/2026").setPaymentAmount(2000).setModeOfPayment("net banking");
        Payment payment5 = new Payment();
        payment5.setTransactionId(102210).setDate("12/2/2026").setPaymentAmount(999).setModeOfPayment("giftcards");


        payments.add(payment1);
        payments.add(payment2);
        payments.add(payment3);
        payments.add(payment4);
        payments.add(payment5);


        //Iterator
        Iterator<Payment> iterator = payments.iterator();
        Payment payment = null;
        PaymentService paymentService = new PaymentService();
        while (iterator.hasNext()) {
            payment = iterator.next();
            paymentService.displayPayment(payment);
        }

    }



}



