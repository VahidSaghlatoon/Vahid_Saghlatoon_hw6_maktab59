package com.vahidsaghlatoon;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    private int nationalCode ;
    private String firstName ;
    private String lastName;
    private int phone ;
    private String email ;
    private Address address ;
    private String userName;
    private String password ;
    private Cart cart ;
    private List<Customers> listCustomers = new ArrayList<>();

    public Customers() {
    }

    public Customers(int nationalCode, String firstName, String lastName, int phone, String email, Address address, String userName, String password) {
        this.nationalCode = nationalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.userName = userName;
        this.password = password;
        Cart cart = new Cart();
    }

    public List<Customers> getListCustomers() {
        return listCustomers;
    }

    public Cart getCart() {
        return cart;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
