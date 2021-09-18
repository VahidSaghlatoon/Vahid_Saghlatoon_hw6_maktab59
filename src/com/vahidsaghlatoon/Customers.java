package com.vahidsaghlatoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customers {
    private String nationalCode ;
    private String firstName ;
    private String lastName;
    private String phone ;
    private String email ;
    private Address address ;
    private String userName;
    private String password ;
    private  static Cart cart = new Cart() ;
    private  static List<Customers> listCustomers = new ArrayList<>();

    public Customers() {
    }

    public Customers(String nationalCode, String firstName, String lastName, String phone, String email, Address address, String userName, String password) {
        this.nationalCode = nationalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.userName = userName;
        this.password = password;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "nationalCode=" + nationalCode +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
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

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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
