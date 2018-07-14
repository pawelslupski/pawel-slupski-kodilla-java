package com.kodilla.good.patterns.challenges.firstChallenge;

public class SupplyOrderDto {
    public final Supplier supplier;
    public final boolean orderIsPlaced;

    public SupplyOrderDto(final Supplier supplier, final boolean orderIsPlaced) {
        this.supplier = supplier;
        this.orderIsPlaced = orderIsPlaced;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrderIsPlaced() {
        return orderIsPlaced;
    }
}
