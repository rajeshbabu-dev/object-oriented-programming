package com.java.oops.practice;

public class CustomerOne {

    int id;
    String name;
    String email;

    public CustomerOne(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void displayCustomerOneDetails() {
        System.out.println("Customer Id: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }else  {
            throw  new IllegalArgumentException("Invalid email");
        }
    }




}

