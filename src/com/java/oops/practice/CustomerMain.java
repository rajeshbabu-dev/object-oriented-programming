package com.java.oops.practice;


public class CustomerMain {
    static void main(String[] args) {
        CustomerOne customerOne = new CustomerOne(10122,"Rajesh","Raj12@gmail.com");
        CustomerOneService.displayDetails(customerOne);

    }
}
