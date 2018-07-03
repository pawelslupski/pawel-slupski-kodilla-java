package com.kodilla.stream.world;


import java.util.*;

public final class Continent {
    private final String continentName;
    private final Set<Country> theCountryList = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        if country.getLocation().equals(this.continentName) {
            theCountryList.add(country);
        }
    }

    public boolean removeCountry(Country country) {
        return theCountryList.remove(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getTheCountryList() {
        return theCountryList;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }
}
