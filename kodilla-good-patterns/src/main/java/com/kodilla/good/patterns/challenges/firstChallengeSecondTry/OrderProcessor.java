package com.kodilla.good.patterns.challenges.firstChallengeSecondTry;

public class OrderProcessor {
    private Supplier supplier;
    private Order order;

    public OrderProcessor(Supplier supplier, Order order) {
        this.supplier = supplier;
        this.order = order;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Order getOrder() {
        return order;
    }

    public void makeOrder() {
        supplier.process(order);
    }

    public void checkOrder() {
        boolean isOrdered = true;
        if (isOrdered) {
            System.out.println("Your order has been successfully completed:)");
        } else {
            System.out.println("Unfortunately your order has been rejected:(");
        }
    }
}
