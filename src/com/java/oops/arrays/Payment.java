package com.java.oops.arrays;

import java.time.LocalDate;

public class Payment {
    Long  transactionId;
    LocalDate date;
    double paymentAmount;
    String modeOfPayment;


    public Payment(Long transactionId, LocalDate date, double paymentAmount, String modeOfPayment) {
        this.transactionId = transactionId;
        this.date = date;
        this.paymentAmount = paymentAmount;
        this.modeOfPayment = modeOfPayment;
    }

    public void displayPaymentDetails() {
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-15s %-15s %-20s %-15s \n", transactionId,date,paymentAmount,modeOfPayment);
    }


}
