package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] myNumbers = new int[] {1, 2, 3, 7, 8, 9, 12, 15, 16, 21, 27, 28, 31, 35, 42, 75, 79, 81, 82, 95};
        double theAverage = ArrayOperations.getAverage(myNumbers);

        System.out.println(theAverage);
        Assert.assertEquals(33.45, theAverage, 0.01);
    }
}
