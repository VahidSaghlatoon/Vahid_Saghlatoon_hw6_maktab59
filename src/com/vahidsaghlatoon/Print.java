package com.vahidsaghlatoon;

import com.vahidsaghlatoon.products.Products;

public class Print {
    public static void showProductList() {
        Products products = new Products();
        System.out.println("------------------------------------productsList----------------------------------------");
        for (Products product : products.getProductsList()
        ) {
            System.out.println(product.toString());
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public void showCustomerList() {
        Customers customers = new Customers();
        if (customers.getListCustomers().size() > 0) {
            for (Customers customer : customers.getListCustomers()
            ) {
                System.out.println(customer.toString());
            }
        }
    }

    public static void shopMenu() {
        System.out.print(
                "1--> show product list\n" +
                        "2--> buy product \n" +
                        "3--> register \n" +
                        "4--> exit\n" +
                        " --> : "
        );
    }

    public static void buyMenu(){
        System.out.print(
                "1--> add to cart by id\n" +
                        "2--> remove from cart by id \n" +
                        "3--> show cart products\n" +
                        "4--> total cart cost \n" +
                        "5--> accept cart \n" +
                        "6--> menu \n" +
                        " --> : " );
    }
}
