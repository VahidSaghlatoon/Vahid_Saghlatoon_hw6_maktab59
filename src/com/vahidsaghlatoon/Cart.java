package com.vahidsaghlatoon;

import com.vahidsaghlatoon.products.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private List<Products> cartProduct = new ArrayList<>();

    public List<Products> getCartProduct() {
        return cartProduct;
    }


    public void addProduct(int id) {
        Products products = new Products();
        for (Products product : products.getProductsList()
        ) {
            if (product.getProductID() == id) {
                if (product.getCount() > 0) {
                    cartProduct.add(product);
                    System.out.println("----product added----");
                } else if (product.getCount() == 0) {
                    System.out.println("---- all of this product sold-----");
                }
            }
        }

    }


    public void sumOfPriceProduct() {
        double totalPrice = 0;
        if (cartProduct.size() > 0)
            for (Products product : cartProduct) {
                totalPrice += product.getPrice();
            }
        System.out.println("------sum of price in cart is : " + totalPrice + "-----");

    }

    public void removeProduct(int id) {
        if (cartProduct.size() > 0)
            for (Products product : cartProduct) {
                if (product.getProductID() == id) {
                    cartProduct.remove(product);
                    System.out.println("----product removed----");
                    break;
                }
            }
        else if (cartProduct.size() == 0)
            System.out.println("----cart is empty----");
        else
            System.out.println("----invalid product id----");

    }

    public void showCartProduct() {
        if (cartProduct.size() > 0) {
            for (Products product : cartProduct
            ) {
                System.out.println(product.toString());
            }
        } else
            System.out.println("----cart is empty----");
    }

    public void removeAllCartProduct() {
        cartProduct.removeAll(cartProduct);
    }

}
