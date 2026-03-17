package com.java.oops.strings;

public class Orders {
    int id;
    String date;
    byte noOfItems;
    float discount;

    public Orders(int id, String date, byte noOfItems, float discount) {
        this.id = id;
        this.date = date;
        this.noOfItems = noOfItems;
        this.discount = discount;
    }
    public void displayOrderDetails(){
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-10s\n ", id, date, noOfItems,discount);


    }
}
