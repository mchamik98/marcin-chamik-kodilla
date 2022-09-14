package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.repository.Repository;
import com.kodilla.good.patterns.challenges.flights.request.FlightsRetriever;

import static com.kodilla.good.patterns.challenges.flights.request.FlightsRetriever.*;

public class Application {

    public static void main(String[] args) {

        FlightsRetriever flightsRetriever = new FlightsRetriever();
        Repository flights = flightsRetriever.retrieve();

        System.out.println("\n Next request \n");
        flights.searchConnection(gdansk, wroclaw);

    }

}