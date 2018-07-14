package com.kodilla.good.patterns.challenges.firstChallenge;

public class SupplyInfoService implements InfoService {

    public void show(Supplier supplier) {
        System.out.println("The supplying company name is: \"" + supplier.getCompanyName() + "\". " +
                "The currently available products are: ");

        for (Product productInfo : supplier.getProducts()) {
            if (productInfo.getQuantity() > 0) {
                System.out.println(productInfo.getProductName() + " " + productInfo.getQuantity());
            }
        }

    }
}
