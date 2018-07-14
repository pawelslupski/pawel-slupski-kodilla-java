package com.kodilla.good.patterns.challenges.firstChallenge;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SupplyOrderRequest {

    private Supplier supplier;
    private LocalDateTime timeOfOrder;
    private LocalDateTime timeOfDelivery;
    private List<Product> orderedProducts = new ArrayList<>();

    public SupplyOrderRequest(Supplier supplier,
                              LocalDateTime timeOfOrder,
                              LocalDateTime timeOfDelivery) {
        this.supplier = supplier;
        this.timeOfOrder = timeOfOrder;
        this.timeOfDelivery = timeOfDelivery;
    }

    public void addProduct(Product product) {
        orderedProducts.add(product);
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }

    public LocalDateTime getTimeOfDelivery() {
        return timeOfDelivery;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }
}
