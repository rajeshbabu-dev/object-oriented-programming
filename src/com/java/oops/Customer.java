package com.java.oops;

public class Customer {
 //state
    int id;
    String name;
    String email;
    String password;
    byte age;
    long mobileNo;
    char gender;
    String address;
    boolean isActive;


    Customer() {
       id = 101;
       age = 21;
       gender = 'M';
       name = "Rajesh";
       address = "Hyderabad";
       mobileNo = 918236440;
       password = "Raj@2004";
       email = "rajesh112@gmail.com";
       isActive = true;

    }

   public Customer(int id, String name, String email, String password, byte age, long mobileNo, char gender, String address, boolean isActive) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.password = password;
      this.age = age;
      this.mobileNo = mobileNo;
      this.gender = gender;
      this.address = address;
      this.isActive = isActive;
   }
}