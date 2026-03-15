package com.java.oops.inheritancepolymorphism;

public class Main {
    static void main(String[] args) {

        RegularCustomer regularCustomer1 = new RegularCustomer("c-1023","Raj", (byte) 20,'M',"raj12@gmail.com",9020124320L,"Hyderabad","4Days",true);
        regularCustomer1.displayRegularCustomerDetails();



        PremiumCustomer customer1 = new PremiumCustomer(
                "C101",
                "Rahul Sharma",
                (byte)28,
                'M',
                "rahul.sharma@gmail.com",
                9876543210L,
                "Hyderabad, Telangana",
                true,
                "Morning"
        );

        customer1.displayPremiumCustomerDetails();

        PremiumCustomer customer2 = new PremiumCustomer(
                "C102",
                "Priya Reddy",
                (byte)32,
                'F',
                "priya.reddy@gmail.com",
                9123456780L,
                "Vijayawada, Andhra Pradesh",
                false,
                "Evening"
        );
        customer2.displayPremiumCustomerDetails();
    }
}
