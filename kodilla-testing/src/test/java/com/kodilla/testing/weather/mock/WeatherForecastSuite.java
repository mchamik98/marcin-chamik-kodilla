package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void gettingTemps(){
        when(temperaturesMock.getTemperatures()).thenReturn(Map.of(
                "Rzeszow", 25.5,
                "Krakow", 26.2,
                "Wroclaw", 24.8,
                "Warszawa", 25.2,
                "Gdansk", 26.1));
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testingAvarage (){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double average = weatherForecast.averageTemperature();
        //Then
        Assertions.assertEquals(25.56, average);

    }

    @Test
    void testingMedian (){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.tempMedian();
        //Then
        Assertions.assertEquals(25.5, median);
    }
}