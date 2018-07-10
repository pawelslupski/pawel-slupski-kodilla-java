package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean order(User user, LocalDateTime timeOfOrder, LocalDateTime timeOfDelivery) {
        System.out.println("Order for: " + user.getName() + " "
                + user.getSurname() + " has been placed on: " + timeOfOrder
                + " . The product will be delivered on: " + timeOfDelivery);
        return true;
    }
}
