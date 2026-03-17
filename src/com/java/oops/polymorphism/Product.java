package com.java.oops.polymorphism;

public class Product {

    int id;
    String name;
    double maxRetailPrice;
    float discountPercentage;

    public Product(String number, String laptop, double maxRetailPrice, float discountPercentage) {
    }

    public Product(int id, String name, double maxRetailPrice, float discountPercentage) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
    }

    public void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Max Retail Price: " + maxRetailPrice);
        System.out.println("Discount Percentage: " + discountPercentage);

    }


}
