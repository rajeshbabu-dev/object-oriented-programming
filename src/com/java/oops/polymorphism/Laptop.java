package com.java.oops.polymorphism;

public class Laptop extends Product {
    String operatingSystem;
    String brand;
    String processor;

//    public Laptop() {
//        super();
//    }

    public Laptop(int id, String name, double maxRetailPrice, float discountPercentage) {
        super(id, name, maxRetailPrice, discountPercentage);
    }

    public Laptop(int id, String name, double maxRetailPrice, float discountPercentage, String operatingSystem, String brand, String processor) {
        super(id, name, maxRetailPrice, discountPercentage);
        this.operatingSystem = operatingSystem;
        this.brand = brand;
        this.processor = processor;
    }
    @Override
    public void displayDetails(){
        System.out.println();
        super.displayDetails();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
    }
}

