package com.java.oops;

public class Main {
    static void main(String[] args) {
        Customer customer = new Customer(121,"raj","rajesh112@gmail.com","Raj@123",(byte)21,9384753847L,'M',"Hyderabad",true);
//        customer.id = 101;
//        customer.age = 21;
//        customer.gender = 'M';
//        customer.name = "Rajesh";
//        customer.address = "Hyderabad";
//        customer.mobileNo = 918236440;
//        customer.password = "Raj@2004";
//        customer.email = "rajesh112@gmail.com";
//        customer.isActive = true;

        System.out.println("Customer Id : " + customer.id);
        System.out.println("Customer Age : " + customer.age);
        System.out.println("Customer Gender : " + customer.gender);
        System.out.println("Customer Name : " + customer.name);
        System.out.println("Customer Address : " + customer.address);
        System.out.println("Customer MobileNumber : " + customer.mobileNo);
        System.out.println("Customer Password : " + customer.password);
        System.out.println("Customer E-mail : " + customer.email);
        System.out.println("Customer Is Active : " + customer.isActive);




        Customer customer2 = new Customer();
//        customer2.id = 103;
//        customer2.age = 23;
//        customer2.gender = 'F';
//        customer2.name = "Vish";
//        customer2.address = "Kukatpally";
//        customer2.mobileNo = 918236447;
//        customer2.password = "babu@2004";
//        customer2.email = "rajesh1122332@gmail.com";
//        customer2.isActive = false;

        System.out.println("Customer 2 Id : " + customer2.id);
        System.out.println("Customer 2 Age : " + customer2.age);
        System.out.println("Customer 2 Gender : " + customer2.gender);
        System.out.println("Customer 2 Name : " + customer2.name);
        System.out.println("Customer 2 Address : " + customer2.address);
        System.out.println("Customer 2 MobileNumber : " + customer2.mobileNo);
        System.out.println("Customer 2 Password : " + customer2.password);
        System.out.println("Customer 2 E-mail : " + customer2.email);
        System.out.println("Customer 2 Is Active : " + customer2.isActive);




    }
}
