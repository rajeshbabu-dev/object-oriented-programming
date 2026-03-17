package com.java.oops.polymorphism;

public class ProductService {
    public void displayDetails(Product product) {
        System.out.println("1");
        product.displayDetails();
    }
    public void displayDetails(Laptop laptop) {
        System.out.println("2");
        laptop.displayDetails();


    }
    public void displayDetails(Television television) {
        System.out.println("3");
        television.displayDetails();
    }
}
