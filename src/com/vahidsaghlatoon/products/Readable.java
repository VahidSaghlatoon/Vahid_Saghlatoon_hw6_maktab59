package com.vahidsaghlatoon.products;

public class Readable extends Products {
    private String type;

    public Readable(int productID, String name, double price, int count, String type) {
        super(productID, name, price, count);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", type= " + type ;
    }
}
