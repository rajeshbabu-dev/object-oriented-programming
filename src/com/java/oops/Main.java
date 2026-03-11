package com.java.oops;

import jdk.jfr.Category;

public class Main {
    public Main() {
    }

    static void main(String[] args) {
        Customer customer = new Customer(121,"raj","rajesh112@gmail.com","Raj@123",(byte)21,9384753847L,'M',"Hyderabad",true);
//                                constructor
//        customer.id = 101;
//        customer.age = 21;
//        customer.gender = 'M';
//        customer.name = "Rajesh";
//        customer.address = "Hyderabad";
//        customer.mobileNo = 918236440;
//        customer.password = "Raj@2004";
//        customer.email = "rajesh112@gmail.com";
//        customer.isActive = true;

        System.out.println("Customer Id : " + customer.id);
        System.out.println("Customer Age : " + customer.age);
        System.out.println("Customer Gender : " + customer.gender);
        System.out.println("Customer Name : " + customer.name);
        System.out.println("Customer Address : " + customer.address);
        System.out.println("Customer MobileNumber : " + customer.mobileNo);
        System.out.println("Customer Password : " + customer.password);
        System.out.println("Customer E-mail : " + customer.email);
        System.out.println("Customer Is Active : " + customer.isActive);





        Customer customer2 = new Customer();
//        customer2.id = 103;
//        customer2.age = 23;
//        customer2.gender = 'F';
//        customer2.name = "Vish";
//        customer2.address = "Kukatpally";
//        customer2.mobileNo = 918236447;
//        customer2.password = "babu@2004";
//        customer2.email = "rajesh1122332@gmail.com";
//        customer2.isActive = false;

        System.out.println("Customer 2 Id : " + customer2.id);
        System.out.println("Customer 2 Age : " + customer2.age);
        System.out.println("Customer 2 Gender : " + customer2.gender);
        System.out.println("Customer 2 Name : " + customer2.name);
        System.out.println("Customer 2 Address : " + customer2.address);
        System.out.println("Customer 2 MobileNumber : " + customer2.mobileNo);
        System.out.println("Customer 2 Password : " + customer2.password);
        System.out.println("Customer 2 E-mail : " + customer2.email);
        System.out.println("Customer 2 Is Active : " + customer2.isActive);



        //PRODUCT DETAILS
        Product product1 = new Product();
        System.out.println("Category : " + product1.category);
        System.out.println("subCategory : " + product1.subCategory);
        System.out.println("productName : " + product1.productName);
        System.out.println("price : " + product1.price);
        System.out.println("rating : " + product1.rating);
        System.out.println("brandName : " + product1.brandName);
        System.out.println("itemWeight : " + product1.itemWeight);
        System.out.println("description : " + product1.description);


//        product 2 argument
        Product product2 = new Product("electronics","windows","laptop",40000,4.0f,"Hp",1.5f,"Easy to Use");
        System.out.println("Category- : " + product2.category);
        System.out.println("subCategory- : " + product2.subCategory);
        System.out.println("productName- : " + product2.productName);
        System.out.println("price- : " + product2.price);
        System.out.println("rating- : " + product2.rating);
        System.out.println("brandName- : " + product2.brandName);
        System.out.println("itemWeight : " + product2.itemWeight);
        System.out.println("description : " + product2.description);



                /*ORDER VARIABLES OR DETAILS  no argument */
        Order order1 = new Order();
        System.out.println("Order Id : " + order1.orderId);
        System.out.println("Date : " + order1.date);
        System.out.println("Address : " + order1.address);
        System.out.println("pin-code : " + order1.pincode);
        System.out.println("Discount : " + order1.discount);
        System.out.println("Tax-Applied : " + order1.tax);
        System.out.println("Total : " + order1.total);


        /* Argument constructor */

        Order order2 = new Order(10203,12/2/2025,"kukatpally","509205",10.5f,5.0f,2000);
        System.out.println("Order Id : " + order2.orderId);
        System.out.println("Date : " + order2.date);
        System.out.println("Address : " + order2.address);
        System.out.println("pin-code : " + order2.pincode);
        System.out.println("Discount : " + order2.discount);
        System.out.println("Tax-Applied : " + order2.tax);
        System.out.println("Total : " + order2.total);


        Payment payment = new Payment();
        System.out.println("Transaction Id : " + payment.transactionId);
        System.out.println("Date : " + payment.date);
        System.out.println("Total Amount : " + payment.paymentAmount);
        System.out.println("Mode Of Payment : " + payment.modeOfPayment);


        Payment payment1 = new Payment(13223233L,null,2301,"CreditCard");
        System.out.println("Transaction Id : " + payment1.transactionId);
        System.out.println("Date : " + payment1.date);
        System.out.println("Total Amount : " + payment1.paymentAmount);
        System.out.println("Mode Of Payment : " + payment1.modeOfPayment);

    }





}
