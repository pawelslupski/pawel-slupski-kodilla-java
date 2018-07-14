package com.kodilla.good.patterns.challenges.firstChallenge;

public class SupplyOrderChecker implements OrderChecker {
    public void check(SupplyOrderDto supplyOrderDto) {
        if(supplyOrderDto.orderIsPlaced) {
            System.out.println("The order has been placed successfully. Thank you!");
        } else {
            System.out.println("The order has been rejected. Sorry!");
        }

    }
}
