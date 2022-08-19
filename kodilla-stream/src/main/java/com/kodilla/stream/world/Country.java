package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal population;

    public Country(final BigDecimal population) {
        this.population = population;
    }

    public BigDecimal getPeopleQuantity(){
        return population;
    }

}