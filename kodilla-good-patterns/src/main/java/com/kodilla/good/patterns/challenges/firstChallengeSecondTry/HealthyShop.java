package com.kodilla.good.patterns.challenges.firstChallengeSecondTry;

public class HealthyShop implements Supplier {
    private final String companyName = "HealthyShop";

    public void process(Order order) {
        System.out.println("Hello! It's:\"" + companyName + "\". " +
                "It's great that you chose us:). I promise you won't regret!. " +
                "Your order is: " + order.getProduct() + " in the quantity of: " + order.getCount()
                + ". We are proud of the quality of our wide range of products:)" + " .Please wait" +
                " as your order is being processed.");
    }
}
