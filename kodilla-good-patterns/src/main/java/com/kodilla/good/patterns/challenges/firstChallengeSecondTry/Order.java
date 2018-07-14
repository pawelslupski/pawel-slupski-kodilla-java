package com.kodilla.good.patterns.challenges.firstChallengeSecondTry;

public class Order {
    private String product;
    private int count;

    public Order(String product, int count) {
        this.product = product;
        this.count = count;
    }

    public String getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
