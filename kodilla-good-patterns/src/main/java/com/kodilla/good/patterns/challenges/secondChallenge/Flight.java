package com.kodilla.good.patterns.challenges.secondChallenge;

import java.util.Objects;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private String changeAirport;

    public Flight(String flightNumber, String departureAirport,
                  String arrivalAirport, String changeAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.changeAirport = changeAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getChangeAirport() {
        return changeAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", changeAirport='" + changeAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(flightNumber.substring(1, 2));
    }
}
