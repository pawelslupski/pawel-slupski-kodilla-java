package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CarbonaraPizzaDecorator extends AbstractPizzaOrderDecorator {
    public CarbonaraPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(12));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + with mozarella, bacon, onion and creme fraiche";
    }
}
