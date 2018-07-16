package com.kodilla.good.patterns.challenges.secondChallenge;

public class FlightChecker {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightBasedOnDeparture("Madrid");
        flightFinder.findFlightBasedOnArrival("Montevideo");
        flightFinder.findFlightToThrough("Heraklion", "Taipei");
    }

}
