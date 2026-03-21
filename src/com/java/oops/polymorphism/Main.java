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


        Customer customer = new Customer(10122,"Raj","Raj12@gmail.com","raj123", (byte) 21,9320234560L,'M');
        CustomerService customerService = new CustomerService();  /*Object creation */
        customerService.displayDetails(customer);

    }
}
