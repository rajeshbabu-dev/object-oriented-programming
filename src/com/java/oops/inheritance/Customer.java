package com.java.oops.inheritance;

public class Customer {
    String customerId;
    String name;
    byte age;
    char gender;
    String email;
    long phoneNO;
    String address;

    public Customer() {
    }

    public Customer(String customerId, String name, byte age, char gender, String email, long phoneNO, String address) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNO = phoneNO;
        this.address = address;
    }

    public void displayCustomerDetails() {
        System.out.println("-------------    customer details   -----------");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Customer Name : " + name);
        System.out.println("Customer Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("E-mail : " + email);
        System.out.println("Phone No : " + phoneNO);
        System.out.println("Address : " + address);
    }
}
