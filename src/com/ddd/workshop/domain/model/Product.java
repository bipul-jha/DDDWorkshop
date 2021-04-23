package com.ddd.workshop.domain.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        Locale currentLocale = Locale.getDefault();
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
        return "Product Name : " + name + "\nPrice : " + currencyFormatter.format(price);
    }
}
