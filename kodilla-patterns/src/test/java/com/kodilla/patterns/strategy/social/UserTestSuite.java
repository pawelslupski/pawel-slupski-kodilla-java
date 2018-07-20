package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User pablo = new YGeneration("Pablo Mokovic");
        User vanessa = new ZGeneration("Vanessa Tinto");
        User michal = new Millenials("Michal Krzynowek");

        //When
        String pabloSharePreferences = pablo.sharePost();
        String vanessaSharePreferences = vanessa.sharePost();
        String michalSharePreferences = michal.sharePost();

        //Then
        Assert.assertEquals("Sharing post on Twitter", pabloSharePreferences);
        Assert.assertEquals("Sharing post on Snapchat", vanessaSharePreferences);
        Assert.assertEquals("Sharing post on Facebook", michalSharePreferences);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User vanessa = new ZGeneration("Vanessa Tinto");

        //When
        String vanessaSharePreferences = vanessa.sharePost();
        System.out.println(vanessaSharePreferences);
        vanessa.setSocialPublisher(new TwitterPublisher());
        vanessaSharePreferences = vanessa.sharePost();
        System.out.println(vanessaSharePreferences);

        //Then
        Assert.assertEquals("Sharing post on Twitter", vanessaSharePreferences);
    }
}
