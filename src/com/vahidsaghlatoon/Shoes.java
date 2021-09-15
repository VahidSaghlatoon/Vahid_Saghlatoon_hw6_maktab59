package com.vahidsaghlatoon;

public class Shoes extends Products {
    private int size ;

    public Shoes(int productID, String name, double price, int count, int size) {
        super(productID, name, price, count);
        this.size = size;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                ", size=" + size ;
    }
}
