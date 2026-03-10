package com.java.oops.strings;

import java.time.LocalDate;

public class Payment {
    Long  transactionId;
    LocalDate date;
    double paymentAmount;
    String modeOfPayment;

    Payment() {
        transactionId = 1123214222L;
        paymentAmount = 3000;
        modeOfPayment = "giftCards";
    }


    public Payment(Long transactionId, LocalDate date, double paymentAmount, String modeOfPayment) {
        this.transactionId = transactionId;
        this.date = date;
        this.paymentAmount = paymentAmount;
        this.modeOfPayment = modeOfPayment;
    }

}
