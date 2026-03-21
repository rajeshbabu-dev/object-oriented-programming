package com.java.oops.collections.set;

import com.java.oops.model.Order;
import com.java.oops.model.Payment;

public class OrderService {
    public static void displayOrder(Order order){
        System.out.println("Order Details ");
        System.out.println("Order Id : " + order.getId());
        System.out.println("Ordered Date : " + order.getDate());
        System.out.println("No Of Items : " + order.getNoOfItems());
        System.out.println("Discount : " + order.getDiscount());
        System.out.println();
    }
}
