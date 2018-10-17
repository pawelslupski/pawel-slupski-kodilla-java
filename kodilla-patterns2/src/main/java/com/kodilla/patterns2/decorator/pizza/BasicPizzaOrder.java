package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15.0);
    }

    @Override
    public String getDescription() {
        return "Pizza made of base, tomato sauce and cheese";
    }

}
