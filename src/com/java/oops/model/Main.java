package com.java.oops.model;

public class Main {
    public void main(String[] args) {
        Payment payment = new Payment();
        payment.setTransactionId(102201)
                .setDate("12/2/2026")
                .setPaymentAmount(1980)
                .setModeOfPayment("giftCard");

        Product product = new Product();
        product.setCategory("Electronics")
                .setSubCategory("Mobile")
                .setProductName("Apple iPhone 14")
                .setPrice(79999)
                .setRating(8.5f);


       Order order = new Order();
        order.setId(101)
                .setDate("21/03/2026")
                .setNoOfItems((byte)3)
                .setDiscount(10.5f);




//        System.out.println("Payment Details :");
//        System.out.println("Transaction Id : " + payment.getTransactionId());
//        System.out.println("Date Of Payment : " + payment.getDate());
//        System.out.println("Amont Paid : " + payment.getPaymentAmount());
//        System.out.println("Mode Of Payment : " + payment.getModeOfPayment());
        System.out.println(payment);
        System.out.println(product);
        System.out.println(order);


    }
}
