package com.example.user.models;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String price;
    private int quantity;
    private Date startDate;
    private Date closeDate;

    public Product(int id, String name, String price, int quantity, Date startDate, Date closeDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.startDate = startDate;
        this.closeDate = closeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }
}
