package com.kodilla.good.patterns.challenges.firstChallengeSecondTry;

public class GlutenFreeShop implements Supplier {
    private final String companyName = "GlutenFreeShop";

    public void process(Order order) {
        System.out.println("Thanks for your order on behalf of \"" + companyName + "\"." +
        " I hope you will be pleased with our products." + " Just to confirm your ordered: " +
                order.getCount() + " of " + order.getProduct() + " . Your order is being processed.");
    }
}
