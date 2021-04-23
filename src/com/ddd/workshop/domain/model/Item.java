package com.ddd.workshop.domain.model;

public class Item {
    private final Product product;
    private final int quantity;

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
