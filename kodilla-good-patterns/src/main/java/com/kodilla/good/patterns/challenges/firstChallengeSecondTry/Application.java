package com.kodilla.good.patterns.challenges.firstChallengeSecondTry;

public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new GlutenFreeShop(),
                                        new Order("Milk", 50));
        orderProcessor.makeOrder();
        orderProcessor.checkOrder();

    }
}
