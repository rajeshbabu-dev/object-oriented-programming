package com.java.oops.arrays;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("C101","Rajesh",(byte)25,'M',"rajesh@gmail.com",9876543210L,"Hyderabad"),
                new Customer("C102","Anita",(byte)28,'F',"anita@gmail.com",9123456780L,"Bangalore"),
                new Customer("C103","Kiran",(byte)30,'M',"kiran@gmail.com",9988776655L,"Chennai"),
                new Customer("C104","Priya",(byte)24,'F',"priya@gmail.com",9871234567L,"Mumbai"),
                new Customer("C105","Arjun",(byte)27,'M',"arjun@gmail.com",9090909090L,"Delhi")
        };


//                   Table pattern printing
//        System.out.println("-----------------------------------------------------");
//        System.out.printf("%-10s %-15s %-5s %-6s %-20s %-10s %-15s \n ", "customerId", "name", "age", "gender", "email", "phoneNO", "address");
//        for (Customer customer : customers){
//            customer.displayCustomersDetails();
//        }

                     /*This is for printing customer details in order wise / each customer seperate */
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Id : " + customers[i].customerId);
            System.out.println("Name : " + customers[i].name);
            System.out.println("Age : " + customers[i].age);
            System.out.println("Gender : " + customers[i].gender);
            System.out.println("Email : " + customers[i].email);
            System.out.println("PhoneNo : " + customers[i].phoneNO);
            System.out.println("Address : " + customers[i].address);
            System.out.println();

        }

        System.out.println();
        for (Customer customer : customers) {
            System.out.println("Id : " + customer.customerId);
            System.out.println("Name : " + customer.name);
            System.out.println("Age : " + customer.age);
            System.out.println("Gender : " + customer.gender);
            System.out.println("Email : " + customer.email);
            System.out.println("PhoneNo : " + customer.phoneNO);
            System.out.println("Address : " + customer.address);
            System.out.println();

        }

                                 /*Payment details*/
        Payment[] payments = {
                new Payment(1001L, LocalDate.of(2026, 3, 10), 2500.50, "UPI"),
                new Payment(1002L, LocalDate.of(2026, 3, 11), 1200.00, "Credit Card"),
                new Payment(1003L, LocalDate.of(2026, 3, 12), 5400.75, "Debit Card"),
                new Payment(1004L, LocalDate.of(2026, 3, 13), 800.25, "Net Banking"),
                new Payment(1005L, LocalDate.of(2026, 3, 14), 3200.00, "Cash")
        };

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-15s %-15s %-20s %-15s \n", "transactionId","date","paymentAmount","modeOfPayment");
        for (Payment payment : payments) {
            payment.displayPaymentDetails();
            System.out.println();
        }
        System.out.println();

//        Order details

        Order[] orders = {
                new Order(101, "2026-03-10", (byte)3, 10.5f),
                new Order(102, "2026-03-11", (byte)5, 15.0f),
                new Order(103, "2026-03-12", (byte)2, 5.5f),
                new Order(104, "2026-03-13", (byte)7, 20.0f),
                new Order(105, "2026-03-14", (byte)4, 12.0f)
        };

        System.out.println("------------------------------------------------------");
        System.out.printf("%-8s %-15s %-15s %-5s \n","id", "date", "noOfItems", "discount");
        for(Order order : orders) {
            order.displayOrderDetails();
        }
        System.out.println();


//        Product details
        Product[] products = {
                new Product(201, "Laptop", 60000.00, 10.5f),
                new Product(202, "Smartphone", 25000.00, 15.0f),
                new Product(203, "Headphones", 3000.00, 20.0f),
                new Product(204, "Smartwatch", 8000.00, 12.5f),
                new Product(205, "Tablet", 20000.00, 18.0f)
        };

        System.out.println("------------------------------------------------------");
        System.out.printf("%-8s %-15s %-20s %-5s \n", "id", "name", "maxRetailPrice", "discount %");        for(Product product : products) {
            product.displayProductDetails();
        }
        System.out.println();

    }
}











