package com.java.oops.abstraction;

public class CustomerService {
    void  deliveryProcess(Customer customer, double orderAmount){
        System.out.println("Customer : " + customer.Name);

        String type = customer.getDeliveryType();
        double charge = customer.getDeliveryCharge(orderAmount);

        System.out.println("Delivery type : " + type);
        System.out.println("Delivery charge : " + charge);
    }


}
