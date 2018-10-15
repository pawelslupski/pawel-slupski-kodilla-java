package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
    //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.addAToB(5.0, 7.2);
        double subResult = calculator.subAFromB(5.0, 1.8);
        double mulResult = calculator.mulAByB(3.0, 5.0);
        double divResult = calculator.divAByB(4.5, 2);
        //Then
        Assert.assertEquals(12.2, addResult, 0.1);
        Assert.assertEquals(3.2, subResult, 0.1);
        Assert.assertEquals(15.0, mulResult, 0.1);
        Assert.assertEquals(2.25, divResult, 0.01);
    }
}
