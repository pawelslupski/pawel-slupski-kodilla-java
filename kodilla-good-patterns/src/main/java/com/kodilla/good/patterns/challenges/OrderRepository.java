package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    void recordOrder(User user, LocalDateTime timeOfOrder, LocalDateTime timeOfDelivery);
}
