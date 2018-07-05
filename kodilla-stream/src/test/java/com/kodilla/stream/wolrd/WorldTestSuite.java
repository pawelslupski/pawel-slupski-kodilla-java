package com.kodilla.stream.wolrd;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        europe.addCountry(new Country("Poland", new BigDecimal(38104069)));
        europe.addCountry(new Country("Romania", new BigDecimal(19579493)));
        asia.addCountry(new Country("India", new BigDecimal(1354132190)));
        asia.addCountry(new Country("Japan", new BigDecimal(127181700)));
        africa.addCountry(new Country("Egypt", new BigDecimal(99378760)));
        africa.addCountry(new Country("Nigeria", new BigDecimal(195865304)));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal(1834241516);
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
