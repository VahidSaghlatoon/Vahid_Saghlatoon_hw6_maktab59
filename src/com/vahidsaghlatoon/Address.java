package com.vahidsaghlatoon;

public class Address {
    private String state ;
    private String city ;
    private String street ;
    private int postalCode ;

    public Address(String state, String city, String street, int postalCode) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
