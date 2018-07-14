package com.kodilla.good.patterns.challenges.firstChallenge;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private final String companyName;
    private List<Product> products = new ArrayList<>();

    public Supplier(String companyName) {
        this.companyName = companyName;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Product> getProducts() {
        return products;
    }
}
