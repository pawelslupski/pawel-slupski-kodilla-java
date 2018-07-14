package com.kodilla.good.patterns.challenges.firstChallenge;

import java.time.LocalDateTime;

public class SupplyOrderRequestRetriever {
    public SupplyOrderRequest retrieve() {
        Supplier supplier = new Supplier("ExtraFoodShop");

        supplier.addProduct(new Product("Milk", "Dairy", 300));
        supplier.addProduct(new Product("Bread", "Bread", 600));
        supplier.addProduct(new Product("Orange Juice", "Juices", 100));
        supplier.addProduct(new Product("Lemon Juice", "Juices", 0));
        supplier.addProduct(new Product("Cottage Cheese", "Dairy", 300));

        LocalDateTime timeOfOrder = LocalDateTime.of(2017, 8, 23, 12, 0);
        LocalDateTime timeOfDelivery = LocalDateTime.of(2018, 8, 16, 12, 0);

        return new SupplyOrderRequest(supplier, timeOfOrder, timeOfDelivery);
    }
}
