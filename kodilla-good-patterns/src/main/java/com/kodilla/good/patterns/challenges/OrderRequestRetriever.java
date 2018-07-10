package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Przemyslaw", "Bielik");
        Product product = new Product(3433124);

        LocalDateTime timeOfOrder = LocalDateTime.of(2017, 8, 23, 12, 0);
        LocalDateTime timeOfDelivery = LocalDateTime.of(2018, 8, 16, 12, 0);

        return new OrderRequest(user, product, timeOfOrder, timeOfDelivery);
    }
}

