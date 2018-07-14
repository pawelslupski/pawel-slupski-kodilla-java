package com.kodilla.good.patterns.challenges.firstChallenge;

public class HealthyShopOrderProcessor implements NewOrderProcessor {
    public SupplyOrderDto process(SupplyOrderRequest supplyOrderRequest) {
        boolean orderIsPlaced = true;
        for (Product ordered : supplyOrderRequest.getOrderedProducts()) {
            if (ordered.getQuantity() > 0) {
                System.out.println(ordered.getProductName() + " " + ordered.getQuantity());
            }
        }
        if(orderIsPlaced) {
            System.out.println("The SupplyOrderDto has been created");
            return new SupplyOrderDto(supplyOrderRequest.getSupplier(), true);
        } else {
            System.out.println("The processing failed! Please fill in missing details");
            return new SupplyOrderDto(supplyOrderRequest.getSupplier(), false);
        }

    }
}
