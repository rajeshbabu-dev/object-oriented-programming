package com.java.oops.inheritance;

public class PremiumCustomer extends Customer {
boolean hasEarlyAccessForSale;
String deliveryTime;

    public PremiumCustomer(String customerId, String name, byte age, char gender, String email, long phoneNO, String address, boolean hasEarlyAccessForSale, String deliveryTime) {
        super(customerId, name, age, gender, email, phoneNO, address);
        this.hasEarlyAccessForSale = hasEarlyAccessForSale;
        this.deliveryTime = deliveryTime;
    }
    public void displayPremiumCustomerDetails(){
        super.displayCustomerDetails();
        System.out.println("Has Early Access : " + hasEarlyAccessForSale);
        System.out.println("Delivery Time : " + deliveryTime);
        System.out.println();
    }
}
