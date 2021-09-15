package com.vahidsaghlatoon;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private int productID ;
    private String name ;
    private double price ;
    private int count ;
    private List<Products> productsList = new ArrayList<>();

    public Products() {
    }

    public Products(int productID, String name, double price, int count) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count ;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
