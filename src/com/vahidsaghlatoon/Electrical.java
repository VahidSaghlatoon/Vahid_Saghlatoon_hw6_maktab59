package com.vahidsaghlatoon;

public class Electrical extends Products {
    private int electricityConsumption;

    public Electrical(int productID, String name, double price, int count, int electricityConsumption) {
        super(productID, name, price, count);
        this.electricityConsumption = electricityConsumption;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", electricityConsumption=" + electricityConsumption
                 ;
    }
}
