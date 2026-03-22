package com.java.oops.abstraction;

import com.java.oops.practice.CustomerOne;

public abstract class Customer {
    String customerId;
    String Name;
    String Email;
    long phoneNumber;

     Customer() {
    }

    public Customer(String customerId, String name, String email, long phoneNumber) {
        this.customerId = customerId;
        Name = name;
        Email = email;
        this.phoneNumber = phoneNumber;
    }


    abstract String getDeliveryType();
     abstract double getDeliveryCharge(double orderAmount);
    public void displayCustomer() {
         System.out.println("Customer name : " + Name);
     }
}
