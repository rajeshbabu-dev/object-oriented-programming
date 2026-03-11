package com.java.oops;

public class Product {
    String category;
    String subCategory;
    String productName;
    int price;
    float rating;
    String brandName;
    float itemWeight;
    String description;


    Product(){
        category = "clothes";
        subCategory = "BottomWear";
        productName = "jeans";
        price = 2009;
        rating = 3.5f;
        brandName = "ck";
        itemWeight = 20.0f;
        description = "Long Lasting and comfort ";

    }


    public Product(String category, String subCategory, String productName, int price, float rating, String brandName, float itemWeight, String description) {
        this.category = category;
        this.subCategory = subCategory;
        this.productName = productName;
        this.price = price;
        this.rating = rating;
        this.brandName = brandName;
        this.itemWeight = itemWeight;
        this.description = description;
    }


}
