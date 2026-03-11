package com.java.oops.strings;

import java.util.Locale;

public class Main {
    static void main(String[] args) {
        //API Ways of creating String objects
        String str1 = new String();
        System.out.println(str1);
        String str2 = new String("abcd");
        System.out.println(str2);
        String str3 = new String("abcd");
        System.out.println(str3);
        String str4 = "abcd";
        System.out.println(str4);
        String str5 = "abcd";
        System.out.println(str5);


        System.out.println(str2 == str3);   // reference comparison
        System.out.println(str4 == str5);
        System.out.println(str2.equals(str5)); /* value comparison */
        char[] chs = {'a','b','c','d','e','f',}; // array of characters

        String str6 = new String(chs);
        System.out.println(str6);

        String email = "raj123@gmail.com";
        System.out.println(str6.charAt(5));
        System.out.println(email.compareTo("raj123@gmail.com"));
        System.out.println(email.compareToIgnoreCase("Raj123@gmail.com"));
        String hello = "Rajesh,";
        System.out.println(hello.concat(email));
        System.out.println(hello.toUpperCase(Locale.ROOT)); //convert lowerCase to UpperCasse or Both
        System.out.println(email);
        System.out.println(hello);
        String password = "R1234esh";

        System.out.println(email.endsWith(".com"));
        if (email.trim().equalsIgnoreCase("raj123@gmail.com") && password.equals("R1234esh"))
            System.out.println("login Successful");
        else
            System.out.println("Invalid Credentials");
        System.out.println(email.length());
        // Password manipulation
        // Rules for Passowrd 1.empty, 2.min & max length, 3.Pattern
        System.out.println(password.isEmpty());
        System.out.println(password.length() > 8 && password.length() < 16);
        System.out.println(password.matches("^[a-zA-Z0-9@]{8,16}$"));

    }
}
