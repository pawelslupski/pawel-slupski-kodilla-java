package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Product product;
    private LocalDateTime timeOfOrder;
    private LocalDateTime timeOfDelivery;

    public OrderRequest(User user, Product product,
                            LocalDateTime timeOfOrder,
                            LocalDateTime timeOfDelivery) {
        this.user = user;
        this.product = product;
        this.timeOfOrder = timeOfOrder;
        this.timeOfDelivery = timeOfDelivery;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }

    public LocalDateTime getTimeOfDelivery() {
        return timeOfDelivery;
    }
}
