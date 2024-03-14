package com.questionpro.grocery_booking.model;

import org.springframework.stereotype.Component;

@Component
public class GroceryItem {
    private Long id;

    private String name;

    private double price;

    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GroceryItem [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    
}
