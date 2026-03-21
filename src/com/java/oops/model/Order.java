package com.java.oops.model;

public class Order {
    int id;
    String date;
    byte noOfItems;
    float discount;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public Order setId(int id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Order setDate(String date) {
        this.date = date;
        return this;
    }

    public byte getNoOfItems() {
        return noOfItems;
    }

    public Order setNoOfItems(byte noOfItems) {
        this.noOfItems = noOfItems;
        return this;
    }

    public float getDiscount() {
        return discount;
    }

    public Order setDiscount(float discount) {
        this.discount = discount;
        return this;
    }

    @Override
    public String toString() {
        return "Order{"
                + "id=" + id
                + ", date='" + date + '\''
                + ", noOfItems=" + noOfItems
                + ", discount=" + discount +'\'' +
                "}";
    }
}
