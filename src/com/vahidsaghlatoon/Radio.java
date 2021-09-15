package com.vahidsaghlatoon;

public class Radio extends Electrical {

    public Radio(int productID, String name, double price, int count, int electricityConsumption) {
        super(productID, name, price, count, electricityConsumption);
    }

    @Override
    public String toString() {
        return "Radio{" +
                super.toString() +
                "} ";
    }
}
