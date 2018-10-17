package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FarmhousePizzaDecorator extends AbstractPizzaOrderDecorator {
    public FarmhousePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(14));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with ham, onion, sausage and mushrooms";
    }
}
