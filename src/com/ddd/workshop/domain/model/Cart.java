package com.ddd.workshop.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items;
    private final List<Item> deletedItems;

    public Cart() {
        items = new ArrayList<>();
        deletedItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        deletedItems.add(item);
        items.remove(item);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void displayDeletedItems() {
        for (Item item : deletedItems) {
            System.out.println(item);
        }
    }
}
