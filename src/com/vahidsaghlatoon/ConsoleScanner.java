package com.vahidsaghlatoon;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleScanner {
    private List<Customers> listCustomers = new ArrayList<>();

    public void register(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter user name : ");
        String userName = input.next();
        System.out.print("Enter password : ");
        String password = input.next();
        System.out.print("Enter first name : ");
        String firstName = input.next();
        System.out.print("Enter last name : ");
        String lastName = input.next();
        System.out.print("Enter national code : ");
        int nationalCode = input.nextInt();
        System.out.print("Enter phone : ");
        int phone = input.nextInt();
        System.out.print("Enter email : ");
        String email = input.next();
        System.out.print("Enter state : ");
        String state = input.next();
        System.out.print("Enter city : ");
        String city = input.next();
        System.out.print("Enter street : ");
        String street = input.next();
        System.out.print("Enter postal code : ");
        int postalCode = input.nextInt();

        Address address = new Address(state,city,street,postalCode);
        Customers customer = new Customers(nationalCode,firstName,lastName,phone,email,address,userName,password);
        listCustomers.add(customer);
    }
}
