package com.vahidsaghlatoon.products;

public class Journal extends Readable {
    public Journal(int productID, String name, double price, int count, String type) {
        super(productID, name, price, count, type);
    }

    @Override
    public String toString() {
        return "Journal{" + super.toString() + "} ";
    }
}
