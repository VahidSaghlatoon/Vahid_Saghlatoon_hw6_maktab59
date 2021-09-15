package com.vahidsaghlatoon;

public class Sport extends Shoes {
    private String type ;

    public Sport(int productID, String name, double price, int count, int size, String type) {
        super(productID, name, price, count, size);
        this.type = type;
    }


    @Override
    public String toString() {
        return "Sport{" +
                super.toString() +
                ", type='" + type + '\'' +
                "} " ;
    }
}
