package com.kodilla.good.patterns.challenges.firstChallenge;

public class ExtraFoodShopOrderProcessor implements NewOrderProcessor {
    public SupplyOrderDto process(SupplyOrderRequest supplyOrderRequest) {
        boolean orderIsPlaced = true;
        System.out.println("Processing the order of: ");
        for (Product ordered : supplyOrderRequest.getOrderedProducts()) {
            if (ordered.getQuantity() > 0) {
                System.out.println(ordered.getProductName() + " " + ordered.getQuantity());
            }
        }
        if(orderIsPlaced) {
            System.out.println("Creating a Dto for the order placed on: " + supplyOrderRequest.getTimeOfOrder() +
            ". The time of estimated delivery is: " + supplyOrderRequest.getTimeOfDelivery());
            return new SupplyOrderDto(supplyOrderRequest.getSupplier(), true);
        } else return new SupplyOrderDto(supplyOrderRequest.getSupplier(), false);

    }
}
