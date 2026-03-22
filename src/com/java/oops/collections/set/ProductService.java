package com.java.oops.collections.set;

import com.java.oops.model.Product;

public class ProductService {
    public void displayProduct(Product product) {
        System.out.println("Product Details ");
        System.out.println("Category : " +  product.getCategory() );
        System.out.println("SubCategory : " +  product.getSubCategory() );
        System.out.println("productName : " + product.getProductName() );
        System.out.println("price : " + product.getPrice() );
        System.out.println("rating : " + product.getRating() );
        System.out.println();
    }
}
