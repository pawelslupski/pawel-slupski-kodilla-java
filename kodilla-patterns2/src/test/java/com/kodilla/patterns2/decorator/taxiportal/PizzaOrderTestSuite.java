package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal price = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15.0), price);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza made of base, tomato sauce and cheese", description);
    }

    @Test
    public void testPepperoniPizzaWithHerbsGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniPizzaDecorator(theOrder);
        theOrder = new HerbsDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(26), thePrice);
    }

    @Test
    public void testPepperoniPizzaWithHerbsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniPizzaDecorator(theOrder);
        theOrder = new HerbsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza made of base, tomato sauce and cheese with pepperoni + extra Basil&Oregano",
                description);
    }

    @Test
    public void FarmhousePizzaWithDoubleCheeseAndGarlicSauceGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FarmhousePizzaDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new GarlicDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(38), thePrice);
    }

    @Test
    public void FarmhousePizzaWithDoubleCheeseAndGarlicSauceGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FarmhousePizzaDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new GarlicDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza made of base, tomato sauce and cheese with ham, onion, sausage and mushrooms +" +
                        " extra double cheese + extra garlic sauce",
                description);
    }

}


