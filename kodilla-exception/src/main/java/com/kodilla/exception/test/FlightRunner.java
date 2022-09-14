package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Monaco", "Cracow");
        Flight flight2 = new Flight("Rzeszow", "Dubai");
        Flight flight3 = new Flight("London", "Cracow");
        Flight flight4 = new Flight("Gdansk", "Warszawa");
        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);

        FlightFinder flightFinder = new FlightFinder(flights);

        try {
            flightFinder.searchForFlight(new Flight("Gdansk", "Warszawa"));
            flightFinder.searchForFlight(new Flight("Cracow", "London"));
        }catch (RouteNotFoundException e){
            System.out.println(e);
        }



    }


}