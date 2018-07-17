package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    public double addAToB(double a, double b) {
        display.displayValue(a + b);
        return a + b;
    }

    public double subAFromB(double a, double b) {
        display.displayValue(a - b);
        return a - b;
    }

    public double mulAByB(double a, double b) {
        display.displayValue(a * b);
        return a * b;
    }

    public double divAByB(double a, double b) {
        display.displayValue(a / b);
        return a / b;
    }
}

