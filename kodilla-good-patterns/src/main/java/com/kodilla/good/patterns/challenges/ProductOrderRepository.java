package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public void recordOrder(User user, LocalDateTime timeOfOrder, LocalDateTime timeOfDelivery) {
        System.out.println("Saving order of product for " + user.getName() + " on "
                + timeOfOrder + " .");
    }
}
