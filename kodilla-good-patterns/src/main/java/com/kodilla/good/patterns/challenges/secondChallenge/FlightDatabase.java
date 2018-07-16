package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {
        private Set<Flight> flightSet = new HashSet<>();

    public FlightDatabase() {
        flightSet.add(new Flight("F2019", "Pamplona",
                "Stuttgart", "no change"));
        flightSet.add(new Flight("F2014", "Pamplona",
                "Katowice", "Warsaw"));
        flightSet.add(new Flight("K2313", "Madrid",
                "Lima", "no change"));
        flightSet.add(new Flight("K2315", "Madrid",
                "Venezuela", "no change"));
        flightSet.add(new Flight("K1023", "Pamplona",
                "Montevideo", "no change"));
        flightSet.add(new Flight("M0943", "Pamplona",
                "Taipei", "Heraklion"));
        flightSet.add(new Flight("F2014", "Gdansk",
                "Lublin", "Rzeszow"));
        flightSet.add(new Flight("M6743", "Pamplona",
                "Katowice", "Warsaw"));
        flightSet.add(new Flight("N9875", "Lisbon",
                "Prague", "no change"));
    }

    public Set<Flight> getSet() {
        return new HashSet<>(flightSet);
    }

}
