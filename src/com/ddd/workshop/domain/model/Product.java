package com.ddd.workshop.domain.model;

public class Product {
    @Override
    public String toString() {
        return productName;
    }

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
