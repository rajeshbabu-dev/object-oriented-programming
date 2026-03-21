package com.java.oops.collections.set;

import com.java.oops.model.Order;

import java.util.Iterator;
import java.util.LinkedHashSet;

                           /*LINKED HASHSET */

public class OrderSet {
    static void main(String[] args) {
        LinkedHashSet<Order> orders = new LinkedHashSet<>();
        Order order1 = new Order();
        order1.setId(20101).setDate("12/2/2026").setNoOfItems((byte)3).setDiscount(10.5f);

        Order order2 = new Order();
        order2.setId(20102).setDate("13/2/2026").setNoOfItems((byte)1).setDiscount(5.0f);

        Order order3 = new Order();
        order3.setId(20103).setDate("14/2/2026").setNoOfItems((byte)5).setDiscount(15.0f);

        Order order4 = new Order();
        order4.setId(20104).setDate("15/2/2026").setNoOfItems((byte)2).setDiscount(8.5f);

        Order order5 = new Order();
        order5.setId(20101).setDate("12/2/2026").setNoOfItems((byte)3).setDiscount(10.5f); // duplicate

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        Iterator<Order> iterator = orders.iterator();
        Order order = null;
        while (iterator.hasNext()) {
            order = iterator.next();
            OrderService.displayOrder(order);
        }

    }
}
