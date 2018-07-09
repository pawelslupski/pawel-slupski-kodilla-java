package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Stuttgart", true);
        airports.put("Lisbon", true);
        airports.put("London", true);
        airports.put("Lima", false);
        airports.put("Frankfurt", true);
        airports.put("Taipei", true);
        airports.put("Gdansk", false);
        airports.put("Prague", true);

        if (airports.containsKey(flight.getArrivalAirport())) {
            System.out.println("Airport " + flight.getArrivalAirport() + " exists in database.");
        } else {
            throw new RouteNotFoundException("There is no such an airport available!");
        }

    }
}
