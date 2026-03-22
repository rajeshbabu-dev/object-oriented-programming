package com.java.oops.abstraction;

public class Main {
    static void main(String[] args) {
        Customer customer1 = new RegularCustomer("1202","Rajesh","raj12@gmail.com",9394973540L);
        Customer customer2 = new RegularCustomer("1203","Priya","priya23@gmail.com",9123456780L);
        Customer customer3 = new PremiumCustomer("2201","Vikram","vikram@gmail.com",9988776655L);
        Customer customer4 = new PremiumCustomer("2202","Neha","neha@gmail.com",9011223344L);

        CustomerService customerService = new CustomerService();

        customerService.deliveryProcess(customer2,1999);
        System.out.println();
        customerService.deliveryProcess(customer3,2899);

    }
}
