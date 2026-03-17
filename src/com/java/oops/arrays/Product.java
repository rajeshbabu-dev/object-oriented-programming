package com.java.oops.arrays;

public class Product {
    int id;
    String name;
    double maxRetailPrice;
    float discountPercentage;

    public Product(int id, String name, double maxRetailPrice, float discountPercentage) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
    }

    public void displayProductDetails(){
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-8s %-15s %-20s %-5s \n", id, name, maxRetailPrice, discountPercentage);
    }

}
