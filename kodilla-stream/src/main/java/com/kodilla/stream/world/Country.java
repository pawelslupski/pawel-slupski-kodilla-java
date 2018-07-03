package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Country {
    private final String countryName;
    private final String peopleQuantity;
    private final String location;
    private final Set<Country> countries = new HashSet<>();

    public Country(final String countryName, final String peopleQuantity, final String location) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
        this.location = location;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
            BigDecimal convertedPeopleQuantity = new BigDecimal(this.peopleQuantity);
            return convertedPeopleQuantity;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuantity='" + peopleQuantity + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }
}
