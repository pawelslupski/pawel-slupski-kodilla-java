package com.kodilla.good.patterns.challenges.secondChallenge;

public class FlightFinder {

    public FlightFinder() {
    }

    public void findFlightBasedOnDeparture(String chosenDepartureAirport) {
        FlightDatabase flightDatabase = new FlightDatabase();
            flightDatabase.getSet().stream()
                    .filter(flight -> flight.getDepartureAirport().matches(chosenDepartureAirport))
                    .forEach(System.out::println);
    }

    public void findFlightBasedOnArrival(String chosenArrivalAirport) {
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.getSet().stream()
                .filter(flight -> flight.getArrivalAirport().matches(chosenArrivalAirport))
                .forEach(System.out::println);
    }

    public void findFlightToThrough(String chosenChangeAirport, String chosenArrivalAirport) {
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.getSet().stream()
                .filter(flight -> flight.getArrivalAirport().matches(chosenArrivalAirport))
                .filter(ft -> ft.getChangeAirport().matches(chosenChangeAirport))
                .forEach(System.out::println);
    }

}
