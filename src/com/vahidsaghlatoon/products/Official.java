package com.vahidsaghlatoon.products;

public class Official extends Shoes {
    public Official(int productID, String name, double price, int count, int size) {
        super(productID, name, price, count, size);
    }


    @Override
    public String toString() {
        return "Official{" +
                super.toString()  +
                "} ";
    }
}
