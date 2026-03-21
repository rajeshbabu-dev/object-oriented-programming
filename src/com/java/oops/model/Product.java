package com.java.oops.model;

public class Product {

    String category;
    String subCategory;
    String productName;
    int price;
    float rating;

    public Product() {
    }

    public String getCategory() {
        return category;
    }

    public Product setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public Product setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Product setRating(float rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public String toString() {
        return "Product{"
                + "category='" + category + '\''
                + ", subCategory='" + subCategory + '\''
                + ", productName='" + productName + '\''
                + ", price=" + price
                + ", rating=" + rating + '\'' +
                "}";

    }
}
