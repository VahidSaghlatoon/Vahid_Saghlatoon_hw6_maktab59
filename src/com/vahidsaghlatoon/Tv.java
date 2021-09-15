package com.vahidsaghlatoon;

public class Tv extends Electrical{
    private int size ;

    public Tv(int productID, String name, double price, int count, int electricityConsumption, int size) {
        super(productID, name, price, count, electricityConsumption);
        this.size = size;
    }


    @Override
    public String toString() {
        return "Tv{" +
                super.toString() +
                "size=" + size +
                "} "  ;
    }
}
