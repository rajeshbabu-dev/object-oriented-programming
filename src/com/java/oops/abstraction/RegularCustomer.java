package com.java.oops.abstraction;

public class RegularCustomer extends Customer{


    public RegularCustomer(String customerId, String name, String email, long phoneNumber) {
        super(customerId, name, email, phoneNumber);
    }

    @Override
    String getDeliveryType() {
        return "Standard Delivery(4-days)";
    }

    @Override
    double getDeliveryCharge(double orderAmount){
        return 50.00;
    }
}
