package com.java.oops.model;

public class Payment {
    private int transactionId;
    private String date;
    private double paymentAmount;
    private String modeOfPayment;

    public Payment() {
    }

    public static void add( ) {
    }

    // Getter & Setter for transactionId
    public int getTransactionId() {
        return transactionId;
    }

    public Payment setTransactionId(int transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    // Getter & Setter for date
    public String getDate() {
        return date;
    }

    public Payment setDate(String date) {
        this.date = date;
        return this;
    }

    // Getter & Setter for paymentAmount
    public double getPaymentAmount() {
        return paymentAmount;
    }

    public Payment setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    // Getter & Setter for modeOfPayment
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