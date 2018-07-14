package com.kodilla.good.patterns.challenges.firstChallenge;

public class Application {

    public static void main(String[] args) {
        SupplyOrderRequestRetriever supplyOrderRequestRetriever = new SupplyOrderRequestRetriever();
        SupplyOrderRequest supplyOrderRequest = supplyOrderRequestRetriever.retrieve();
        supplyOrderRequest.addProduct(new Product("Milk", "Dairy", 300));
        supplyOrderRequest.addProduct(new Product("Bread", "Bread", 600));

        SupplyOrderProcessor supplyOrderProcessor = new SupplyOrderProcessor(new SupplyInfoService(),
                new ExtraFoodShopOrderProcessor(), new SupplyOrderChecker());

        supplyOrderProcessor.placeTheOrder(supplyOrderRequest);

    }
}
