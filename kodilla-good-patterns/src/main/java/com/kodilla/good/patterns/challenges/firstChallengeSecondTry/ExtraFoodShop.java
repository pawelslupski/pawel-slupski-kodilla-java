package com.kodilla.good.patterns.challenges.firstChallengeSecondTry;

public class ExtraFoodShop implements Supplier {
    private final String companyName = "ExtraFoodShop";

    public void process(Order order) {
        System.out.println("I`d like to thank you for your order of " + order.getProduct()
                + " on behalf of \"" + companyName + "\"." + "Your order is being processed...");
    }
}
