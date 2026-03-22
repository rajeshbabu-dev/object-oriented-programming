package com.java.oops.collections.set;

import com.java.oops.model.Payment;
import com.java.oops.model.Product;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.TreeSet;

public class ProductSet {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();
        Product product1 = new Product();
        product1.setCategory("Electronics")
                .setSubCategory("Mobile")
                .setProductName("Samsung Galaxy S21")
                .setPrice(55000)
                .setRating(4.5f);

        Product product2 = new Product();
        product2.setCategory("Electronics")
                .setSubCategory("Laptop")
                .setProductName("HP Pavilion")
                .setPrice(72000)
                .setRating(4.3f);

        Product product3 = new Product();
        product3.setCategory("Home Appliances")
                .setSubCategory("Refrigerator")
                .setProductName("LG Double Door")
                .setPrice(30000)
                .setRating(4.4f);

        Product product4 = new Product();
        product4.setCategory("Fashion")
                .setSubCategory("Men Clothing")
                .setProductName("Levi's Jeans")
                .setPrice(2500)
                .setRating(4.2f);

        Product product5 = new Product();
        product5.setCategory("Electronics")
                .setSubCategory("Mobile")
                .setProductName("Samsung Galaxy S21")
                .setPrice(55000)
                .setRating(4.5f); // duplicate

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);


        Iterator<Product> iterator = products.iterator();
        Product product = null;
        ProductService productService = new ProductService();
        while (iterator.hasNext()) {
            product = iterator.next();
            productService.displayProduct(product);
        }




    }









}
