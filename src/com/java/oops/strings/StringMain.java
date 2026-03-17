package com.java.oops.strings;

public class StringMain {
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

    public static Orders[] getOrderFromString(String[] orderData) {
        Orders[] orders = new Orders[orderData.length];
        for (int index = 0 ; index < orderData.length ; index++){
            String[] split = orderData[index].split(",");
            Orders order = new Orders(Integer.parseInt(split[0]),split[1],Byte.parseByte(split[2]),Float.parseFloat(split[3]));
            orders[index] = order;
        }
        return orders;
    }

    public static Product[] getProductFromString(String[] productData){
        Product[] product = new Product[productData.length];
        for (int index = 0 ; index < product.length ; index++){
            String[] split = productData[index].split(",");
            Product products = new Product(Integer.parseInt(split[0]),split[1],Double.parseDouble(split[2]),Float.parseFloat(split[3]) );
            product[index] = products;
        }
        return product;
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

        String[] orderData = {
                "101,2026-03-01,3,10",
                "102,2026-03-02,5,5",
                "103,2026-03-03,2,0",
                "104,2026-03-04,7,15",
                "105,2026-03-05,4,8",
                "106,2026-03-06,6,12",
                "107,2026-03-07,1,0",
                "108,2026-03-08,9,20",
                "109,2026-03-09,3,5",
                "110,2026-03-10,8,18"
        };

        String[] productData = {
                "101,Laptop,65000.0,10.5",
                "102,Smartphone,30000.0,12.0",
                "103,Headphones,2500.0,8.5",
                "104,Smartwatch,5000.0,15.0",
                "105,Tablet,20000.0,9.0",
                "106,Keyboard,1200.0,5.5",
                "107,Mouse,800.0,6.0",
                "108,Monitor,15000.0,11.5",
                "109,Printer,10000.0,7.0",
                "110,Speaker,3500.0,13.0",
        };


        Customers[] customers = getCustomerFromString(customersdata);
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-10s\n ", "ID","Name","Address","Phone no");
        for (Customers customer : customers){
            customer.displayCustomersDetails();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        Orders[] orders = getOrderFromString(orderData);
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-10s\n ", "id","Date","No of Items","Discount");
        for (Orders order : orders){
            order.displayOrderDetails();
        }
        System.out.println();
        System.out.println();
        System.out.println();


        Product[] products = getProductFromString(productData);
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-10s\n ", "id","Name","MaxRetailPrice","Discount");
        for (Product product : products){
            product.displayProductDetails();
        }
        System.out.println();
        System.out.println();
        System.out.println();


    }




}

