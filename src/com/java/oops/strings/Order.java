package com.java.oops.strings;

public class Order {
    int orderId;
    int date;
    String address;
    String pincode;
    float discount;
    float tax;
    int total;

    Order() {
        orderId = 123111;
        date = 1/2/2000;
        address = "Hyderabad";
        pincode = "500037";
        discount = 10.0f;
        tax = 5.2f;
        total = 1500;

    }

    public Order(int orderId, int date, String address, String pincode, float discount, float tax, int total) {
        this.orderId = orderId;
        this.date = date;
        this.address = address;
        this.pincode = pincode;
        this.discount = discount;
        this.tax = tax;
        this.total = total;
    }

}
