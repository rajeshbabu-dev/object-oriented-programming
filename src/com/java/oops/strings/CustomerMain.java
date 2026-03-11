package com.java.oops.strings;

public class CustomerMain {
    public static Customers[] getCustomerFromString(String[] CustomersData){
        //products data iterate
        //split data
        //create product object with split data
        //put the product object in array

        Customers[] customers = new Customers[CustomersData.length];
        for(int index = 0 ; index < CustomersData.length; index++){
            String[] split = CustomersData[index].split(",");
            Customers customer = new Customers(split[0],split[1],split[2],Long.parseLong(split[3]) );
            customers[index] = customer;

        }
        return customers;
    }



    public static void main(String[] args){
        String[] customersdata = {
                "101,Rajesh Kumar,Hyderabad,9876543210",
                "102,Anil Sharma,Bangalore,9876543211",
                "103,Priya Reddy,Chennai,9876543212",
                "104,Rahul Verma,Mumbai,9876543213",
                "105,Sneha Patel,Ahmedabad,9876543214",
                "106,Arjun Singh,Delhi,9876543215",
                "107,Kavya Nair,Kochi,9876543216",
                "108,Rohit Gupta,Pune,9876543217",
                "109,Meena Iyer,Coimbatore,9876543218",
                "110,Vikram Das,Kolkata,9876543219"
        };


        Customers[] customers = getCustomerFromString(customersdata);
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-10s\n ", "ID","Name","Address","Phone no");
        for (Customers customer : customers){
            customer.displayCustomersDetails();
        }
    }



}

