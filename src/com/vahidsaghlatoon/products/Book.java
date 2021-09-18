package com.vahidsaghlatoon.products;

public class Book extends Readable {

    public Book(int productID, String name, double price, int count, String type) {
        super(productID, name, price, count, type);
    }

    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                "} ";
    }
}
