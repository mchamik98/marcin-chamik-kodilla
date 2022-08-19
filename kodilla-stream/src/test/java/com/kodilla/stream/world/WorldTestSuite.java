package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        //Europe
        Country poland  = new Country(new BigDecimal("2000000000"));
        Country portugal  = new Country(new BigDecimal("2000000000"));
        Country sweden      = new Country(new BigDecimal("2000000000"));
        Country germany   = new Country(new BigDecimal("2000000000"));

        //Asia
        Country indonesia       = new Country(new BigDecimal("2000000000"));
        Country india     = new Country(new BigDecimal("2000000000"));
        Country japan    = new Country(new BigDecimal("2000000000"));
        Country vietnam    = new Country(new BigDecimal("2000000000"));

        //Africa
        Country nigeria = new Country(new BigDecimal("2000000000"));
        Country ghana = new Country(new BigDecimal("2000000000"));
        Country senegal = new Country(new BigDecimal("2000000000"));

        Continent europe    = new Continent(List.of(poland,portugal,sweden,germany));
        Continent asia      = new Continent(List.of(indonesia, india, japan, vietnam));
        Continent africa    = new Continent(List.of(nigeria, ghana, senegal));

        World world = new World(List.of(europe, asia, africa));

        //when
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("22000000000");

        //Then
        assertEquals(expectedResult,result);

    }

}