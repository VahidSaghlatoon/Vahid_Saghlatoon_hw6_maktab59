package com.vahidsaghlatoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private List<Products> cartProduct = new ArrayList<>();

    public void addProduct() {
        Scanner input = new Scanner(System.in);
        ConsoleScanner consoleScanner = new ConsoleScanner();
        System.out.println("enter product id : ");
        int id = input.nextInt();
                for (Products product : consoleScanner.getProductsList()
                ) {
                    if (product.getProductID() == id) {
                        cartProduct.add(product);
                        System.out.println("-----added to cart-----");
                    } else
                        System.out.println("-----product id invalid-----");
                }
        }

    public void sumOfPriceProduct() {
        double totalPrice = 0;
        if (cartProduct.size() > 0)
            for (Products product : cartProduct) {
                totalPrice += product.getPrice();
            }
        System.out.println("sum of price in cart is : " + totalPrice);

    }

    public void removeProduct(int id) {
        if (cartProduct.size() > 0)
            for (Products choice : cartProduct) {
                if (choice.getProductID() == id)
                    cartProduct.remove(choice);
            }
    }

    public void showCartProduct() {
        ConsoleScanner consoleScanner = new ConsoleScanner();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name : ");
        String userName = input.next();
        for (Customers customer : consoleScanner.getListCustomers()
        ) {
            if (customer.getUserName().equals(userName)){
                for (Products product : cartProduct
                ) {
                    System.out.println(product.toString());
                }
            }

        }

    }
}
