package com.java.oops.arrays;

public class Customer {
    String customerId;
    String name;
    byte age;
    char gender;
    String email;
    long phoneNO;
    String address;

    public Customer(String customerId, String name, byte age, char gender, String email, long phoneNO, String address) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNO = phoneNO;
        this.address = address;
    }

    public void dispalyCustomerDetails() {
        System.out.println("customerId" + customerId);
        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println("gender" + gender);
        System.out.println("email" + email);
        System.out.println("phoneNO" + phoneNO);
        System.out.println("address" + address);
        System.out.println();
    };

//             Table pattern printing

//    public void displayCustomersDetails() {
//        System.out.println("-----------------------------------------------------");
//        System.out.printf("%-10s %-15s %-5s %-6s %-20s %-10s %-15s \n ", customerId, name, age, gender, email, phoneNO, address);
//
//    }
}
