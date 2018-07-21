package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                        .bun("NO SESAME")
                        .burgers(2)
                        .sauce("100 ISLANDS")
                        .ingredient("ONION")
                        .ingredient("BACON")
                        .ingredient("LETTUCE")
                        .ingredient("CUCUMBER")
                        .ingredient("CHILI")
                        .build();
        System.out.println(bigMac);
        //When
        String typeOfBun = bigMac.getBun();
        String typeOfSauce = bigMac.getSauce();
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals("NO SESAME", typeOfBun);
        Assert.assertEquals("100 ISLANDS", typeOfSauce);
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertTrue(bigMac.getIngredients().contains("CHILI"));
    }
}
