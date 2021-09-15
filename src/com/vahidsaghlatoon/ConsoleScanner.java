package com.vahidsaghlatoon;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleScanner {
    Customers customers = new Customers();
    Products products = new Products();

    public void menu() {
        Scanner input = new Scanner(System.in);
        int choice;
        boolean check = true;
        while (check) {
            Cart cart = new Cart();
            System.out.print(
                    "1--> show product list\n" +
                            "2--> add to cart\n" +
                            "3--> remove from cart\n" +
                            "4--> show cart products\n" +
                            "5--> total cost \n" +
                            "6--> accept cart \n" +
                            " : "
            );
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showProductList();
                    break;
                case 2:
                    cart.addProduct();
                    break;
                case 4:
                    cart.showCartProduct();
                    break;
                case 0:
                    check = false;
                    break;
            }
        }
    }

    public void showProductList() {
        System.out.println("-----------------------------productsList----------------------------------------");
        for (Products product : products.getProductsList()
        ) {
            System.out.println(product.toString());
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public void readyProduct() {
        Radio radio = new Radio(1, "sony", 2000, 2, 10);
        products.getProductsList().add(radio);

        Tv tv = new Tv(2, "marshall", 5000, 10, 20, 43);
        products.getProductsList().add(tv);

        Book book = new Book(3, "shahname", 3000, 5, "historical");
        products.getProductsList().add(book);

        Journal journal = new Journal(4, "laliga", 1000, 2, "sport");
        products.getProductsList().add(journal);

        Sport sport = new Sport(5, "lotta", 25000, 10, 40, "footsall");
        products.getProductsList().add(sport);

        Official official = new Official(6, "bella", 12000, 3, 40);
        products.getProductsList().add(official);


    }

    public void registerCustomer() {
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

        Address address = new Address(state, city, street, postalCode);
        Customers customer = new Customers(nationalCode, firstName, lastName, phone, email, address, userName, password);
        customer.getListCustomers().add(customer);
        System.out.println("register successful");
    }
}
