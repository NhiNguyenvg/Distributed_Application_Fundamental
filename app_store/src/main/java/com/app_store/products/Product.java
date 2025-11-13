package com.app_store.products;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private int id;
    private String name;
    private double price;
    private String size;
    private String color;

    // Constructor
    public Product(int id, String name, double price, String size, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    // Getter and Setter methods for each attribute

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Static list of 5 example products
    public static List<Product> getExampleProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 999.99, "15 inch", "Silver"));
        products.add(new Product(2, "Smartphone", 599.99, "6 inch", "Black"));
        products.add(new Product(3, "Headphones", 199.99, "One Size", "Blue"));
        products.add(new Product(4, "Smartwatch", 149.99, "One Size", "Black"));
        products.add(new Product(5, "Tablet", 349.99, "10 inch", "White"));
        return products;
    }

}
