package com.java.oops.polymorphism;

public class Main {
    static void main(String[] args) {

        Product product = new Product(101,"Product-101",65000.0,10.5f);
        ProductService productService = new ProductService();
        productService.displayDetails(product);

        Laptop laptop = new Laptop(101,"Product-101",65000.0,10.5f,"windows","HP","intel");
        productService.displayDetails(laptop);

        Television television = new Television(101,"Product-101",65000.0,10.5f,32.5f,"4k","colour");
        productService.displayDetails(television);

    }
}
