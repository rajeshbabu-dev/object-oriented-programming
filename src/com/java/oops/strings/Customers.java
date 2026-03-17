package com.java.oops.strings;

public class Customers {

        String id;
        String name;
        long phoneNo;
        String address;

    public Customers(String id, String name, String address, long phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void displayCustomersDetails() {
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-10s\n ", id, name,address,phoneNo);

    }
}
