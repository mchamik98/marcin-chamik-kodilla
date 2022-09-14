package com.kodilla.good.patterns.challenges.flightsmanager.cities;



import java.util.Map;


import static com.kodilla.good.patterns.challenges.flightsmanager.cities.SupportedCities.*;


public class City {

     private String name;
     private String alias;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (!name.equals(city.name)) return false;
        return alias.equals(city.alias);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + alias.hashCode();
        return result;
    }

    private City(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    private static Map<SupportedCities, City> cities = Map.of(
            GDK, new City("Gdansk", "GDK"),
            WRO, new City("Wroclaw", "WRO"),
            KRK, new City("Krakow", "KRK"),
            WAW, new City("Warszawa", "WAW")
    );

    public static City getCity(SupportedCities cityAlias){
        return cities.get(cityAlias);
    }

    @Override
    public String toString() {
        return name;
    }
}