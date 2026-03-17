package com.java.oops.arrays;

public class Order {
    int id;
    String date;
    byte noOfItems;
    float discount;

    public Order(int id, String date, byte noOfItems, float discount) {
        this.id = id;
        this.date = date;
        this.noOfItems = noOfItems;
        this.discount = discount;
    }

    public void displayOrderDetails() {
        System.out.println("------------------------------------------------------");
        System.out.printf("%-8s %-15s %-15s %-5s \n",id, date, noOfItems, discount);
    }
}
