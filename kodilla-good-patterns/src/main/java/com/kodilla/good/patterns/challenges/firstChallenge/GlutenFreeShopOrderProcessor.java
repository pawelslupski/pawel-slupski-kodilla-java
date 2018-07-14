package com.kodilla.good.patterns.challenges.firstChallenge;

public class GlutenFreeShopOrderProcessor implements NewOrderProcessor {
    public SupplyOrderDto process(SupplyOrderRequest supplyOrderRequest) {
        System.out.println("Processing the order with " + supplyOrderRequest.getSupplier().getCompanyName());
        for (Product ordered : supplyOrderRequest.getOrderedProducts()) {
            if (ordered.getQuantity() > 0) {
                System.out.println(ordered.getProductName() + " " + ordered.getQuantity());
            }
        }
        boolean orderIsPlaced = true;
        if (orderIsPlaced) {
            System.out.println("Creating a Dto for your Order");
            return new SupplyOrderDto(supplyOrderRequest.getSupplier(), true);
        } else {
            System.out.println("Something went wrong! Please check your supplyOrderRequest");
            return new SupplyOrderDto(supplyOrderRequest.getSupplier(), false);
        }

    }
}

