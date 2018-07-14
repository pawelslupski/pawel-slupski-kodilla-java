package com.kodilla.good.patterns.challenges.firstChallenge;

import java.time.LocalDateTime;

public class AnotherSupplyOrderDto {
    public final Supplier supplier;
    public final boolean orderIsPlaced;
    private LocalDateTime timeOfOrder;

    public AnotherSupplyOrderDto(Supplier supplier, boolean orderIsPlaced, LocalDateTime timeOfOrder) {
        this.supplier = supplier;
        this.orderIsPlaced = orderIsPlaced;
        this.timeOfOrder = timeOfOrder;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrderIsPlaced() {
        return orderIsPlaced;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }
}
