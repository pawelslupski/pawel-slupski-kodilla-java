package com.kodilla.exception.test;

public class FlightExceptionHandling {

    public static void main(String[] arg) {

        FlightFinder flightFinder = new FlightFinder();

        Flight F2019 = new Flight("Pamplona", "Stuttgart");
        Flight R1019 = new Flight("Warsaw", "Lisbon");
        Flight L3453 = new Flight("Katowice", "London");
        Flight K2313 = new Flight("Madrid", "Lima");
        Flight K1023 = new Flight("Montevideo", "Frankfurt");
        Flight M0943 = new Flight("Heraklion", "Taipei");
        Flight M6743 = new Flight("Strasbourg", "Gdansk");
        Flight N9873 = new Flight("Lublin", "Prague");
        Flight N9875 = new Flight("Lublin", "Rzeszow");

        try {
            flightFinder.findFlight(R1019);
        } catch (RouteNotFoundException ex) {
            System.out.println("Exception \"" + ex.toString() + "\" has been caught and handled");
        }

        try {
            flightFinder.findFlight(N9875);
        } catch (RouteNotFoundException ex) {
            System.out.println("Exception \"" + ex.toString() + "\" has been caught and handled");
        }

    }
}
