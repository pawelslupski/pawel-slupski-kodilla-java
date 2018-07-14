package com.kodilla.good.patterns.challenges.firstChallenge;

public final class Product {
    private final String productName;
    private final String productType;
    private double quantity;

    public Product(final String productName,
                   final String productType,
                   double quantity) {
        this.productName = productName;
        this.productType = productType;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public double getQuantity() {
        return quantity;
    }
}
