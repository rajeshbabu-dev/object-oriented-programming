package com.java.oops.inheritance;

public class RegularCustomer extends Customer{
    String deliveryType;
    boolean isChargesApplicable;


    public RegularCustomer(String customerId, String name, byte age, char gender, String email, long phoneNO, String address, String deliveryType, boolean isChargesApplicable) {
        super(customerId, name, age, gender, email, phoneNO, address);
        this.deliveryType = deliveryType;
        this.isChargesApplicable = isChargesApplicable;
    }

    public void displayRegularCustomerDetails(){
        super.displayCustomerDetails();
        System.out.println("Delivery Type : " + deliveryType);
        System.out.println("Is Charges Applicable : " + isChargesApplicable);
        System.out.println("");
    }
}
