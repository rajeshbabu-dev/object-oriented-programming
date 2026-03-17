package com.java.oops.polymorphism;

public class Television extends Product {

    Float screenSize;
    String quality;
    String type;

    public Television(Float screenSize, String quality, String type) {
        super("101", "Laptop", 65000.0, 10.5f);
        this.screenSize = screenSize;
        this.quality = quality;
        this.type = type;
    }

    public Television(int id, String name, double maxRetailPrice, float discountPercentage, Float screenSize, String quality, String type) {
        super(id, name, maxRetailPrice, discountPercentage);
        this.screenSize = screenSize;
        this.quality = quality;
        this.type = type;
    }

    @Override
    public void displayDetails(){
        System.out.println();
        super.displayDetails();
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Quality: " + quality);
        System.out.println("Type: " + type);
    }
}
