package com.vahidsaghlatoon;

import com.vahidsaghlatoon.products.*;

import java.util.Scanner;

public class Shop {

    public void readyProduct() {

        Products products = new Products();
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

        Customers customers = new Customers();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter user name : ");
        customers.setUserName(input.next());
        System.out.print("Enter password : ");
        customers.setPassword(input.next());
        System.out.print("Enter first name : ");
        customers.setFirstName(input.next());
        System.out.print("Enter last name : ");
        customers.setLastName(input.next());
        System.out.print("Enter national code : ");
        customers.setNationalCode(input.next());
        System.out.print("Enter phone : ");
        customers.setPhone(input.next());
        System.out.print("Enter email : ");
        customers.setEmail(input.next());
        Address address = new Address();
        System.out.print("Enter state : ");
        address.setState(input.next());
        System.out.print("Enter city : ");
        address.setCity(input.next());
        System.out.print("Enter street : ");
        address.setStreet(input.next());
        System.out.print("Enter postal code : ");
        address.setPostalCode(input.next());

        customers.setAddress(address);
        customers.getListCustomers().add(customers);
        System.out.println("--------register successful--------");
    }

    public String login() {
        Scanner input = new Scanner(System.in);
        Customers customers = new Customers();
        String userName = "";
        String password;
        if (customers.getListCustomers().size() > 0) {
            System.out.println("------Login------");
            System.out.print("Enter user name : ");
            userName = input.next();
            for (Customers customer : customers.getListCustomers()
            ) {
                if (customer.getUserName().equals(userName)) {
                    System.out.print("Enter password : ");
                    password = input.next();
                    if (checkUserPass(userName, password)) {
                        System.out.println("----Welcome " + userName + "----");
                        break;
                    } else {
                        userName = "";
                        System.out.println("----password is invalid----");
                        System.out.println("----try agian----");
                    }
                } else {
                    userName = "";
                    System.out.println("----invalid user name / dont have register----");
                    break;
                }
            }
        } else
            System.out.println("----register please -----");
        return userName;

    }

    public boolean checkUserPass(String userName, String password) {
        Customers customers = new Customers();
        for (Customers customer : customers.getListCustomers()
        ) {
            if (userName.equals(customer.getUserName()) && password.equals(customer.getPassword()))
                return true;
        }
        return false;
    }

    public void buy() {
        String userName = login();
        Customers customers = new Customers();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        if (!userName.equals("")) {
            while (check) {
                Print.buyMenu();
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        for (Customers customer : customers.getListCustomers()
                        ) {
                            if (customer.getUserName().equals(userName)) {
                                System.out.print("Enter product id : ");
                                customer.getCart().addProduct(input.nextInt());
                            }
                        }
                        break;
                    case 2:
                        for (Customers customer : customers.getListCustomers()
                        ) {
                            if (customer.getUserName().equals(userName)) {
                                System.out.print("Enter product id : ");
                                customer.getCart().removeProduct(input.nextInt());
                            }
                        }
                        break;
                    case 3:
                        for (Customers customer : customers.getListCustomers()
                        ) {
                            if (customer.getUserName().equals(userName)) {
                                customer.getCart().showCartProduct();
                            }
                        }
                        break;
                    case 4:
                        for (Customers customer : customers.getListCustomers()
                        ) {
                            if (customer.getUserName().equals(userName)) {
                                customer.getCart().sumOfPriceProduct();
                            }
                        }
                        break;
                    case 5:
                        for (Customers customer : customers.getListCustomers()
                        ) {
                            if (customer.getUserName().equals(userName)) {
                                if (customer.getCart().getCartProduct().size() > 0) {
                                    System.out.print("---> Are you sure ? Yes-->1  No--> : ");
                                    int choice1 = input.nextInt();
                                    if (choice1 == 1) {
                                        Products products = new Products();
                                        Cart cart = customer.getCart();
                                        for (Products cartProduct : cart.getCartProduct()
                                        ) {
                                            for (Products product : products.getProductsList()
                                            ) {
                                                if (cartProduct.getProductID() == product.getProductID()) {
                                                    product.setCount(product.getCount() - 1);
                                                }
                                            }
                                        }
                                        cart.removeAllCartProduct();
                                    } else
                                        break;
                                }
                            }
                        }
                        break;
                    case 6:
                        check = false;
                        break;
                }
            }
        }
    }

    public void menu() {
        Shop shop = new Shop();
        shop.readyProduct();
        Scanner input = new Scanner(System.in);
        int choice;
        boolean check = true;
        while (check) {
            Print.shopMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    Print.showProductList();
                    break;
                case 2:
                    shop.buy();
                    break;
                case 3:
                    shop.registerCustomer();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }
}
