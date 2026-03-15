package com.java.oops.model;

import java.time.LocalDate;

public class Payment {
    private int  transactionId;
    private String date;
    private double paymentAmount;
    private String modeOfPayment;

    public Payment() {
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Payment setTransactionId(int transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Payment setDate(String date) {
        this.date = date;
        return this;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public Payment setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public Payment setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
        return this;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "transactionId=" + transactionId +
                ", date='" + date + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                '}';
    }
}
