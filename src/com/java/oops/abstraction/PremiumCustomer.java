package com.java.oops.abstraction;

public class PremiumCustomer extends Customer{


    public PremiumCustomer(String customerId, String name, String email, long phoneNumber) {
        super(customerId, name, email, phoneNumber);
    }

    @Override
    String  getDeliveryType() {
        return "Express delivery(24-48 hrs)";
    }

    @Override
    double getDeliveryCharge(double orderAmount) {
        return 0.0;
    }
}
