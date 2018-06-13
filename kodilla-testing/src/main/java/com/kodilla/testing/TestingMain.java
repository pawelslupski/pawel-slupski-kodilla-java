package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")) {
                System.out.println("Test OK");
            } else {
                System.out.println("Error!");
            }

            //Calculator Test
            Calculator calculator = new Calculator(8, 5);

            int resultAdd = calculator.addAtoB();
            int resultSubtract = calculator.subtractAFromB();

            System.out.println(calculator.getA());
            System.out.println(calculator.getB());

            if (resultAdd == 13) {
                System.out.println("Test OK");
            } else {
                System.out.println("Error");
            }

            if (resultSubtract == 3) {
                System.out.print("OK again");
            } else {
                System.out.println("Error");
            }

    }
}
