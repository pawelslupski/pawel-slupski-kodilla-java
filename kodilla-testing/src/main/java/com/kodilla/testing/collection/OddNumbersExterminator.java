package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public OddNumbersExterminator(){};

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        int number = 0;
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for (int n = 0; n < numbers.size(); n++) {
            number = numbers.get(n);
            if (number % 2 == 0) {
                oddNumbers.add(number);
            }
        }
        return(oddNumbers);
    }
}











