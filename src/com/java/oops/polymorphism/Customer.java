package com.java.oops.polymorphism;

public class Customer {
    int id;
    String name;
    String email;
    String password;
    byte age;
    long mobileNo;
    char gender;

    public Customer() {
    }

    public Customer(int id, String name, String email, String password, byte age, long mobileNo, char gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.mobileNo = mobileNo;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer Password: " + password);
        System.out.println("Customer Age: " + age);
        System.out.println("Customer Mobile No: " + mobileNo);
        System.out.println("Customer Gender: " + gender);
    }
}
