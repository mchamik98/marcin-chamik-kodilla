package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String,Double> calculateForecast(){
        Map<String,Double> resultMap = new HashMap<>();

        for (Map.Entry<String,Double>temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
        }

    public Double averageTemperature() {
        double sum = 0;
        double average;

        for (Map.Entry<String,Double> map : temperatures.getTemperatures().entrySet()){
            sum += map.getValue();
        }
        average = sum/temperatures.getTemperatures().size();
        return average;
    }

    public Double tempMedian(){
        List<Double> tempList = new ArrayList<>();
        double median;
        double twoMiddleValues;

        for(Map.Entry<String,Double> map : temperatures.getTemperatures().entrySet()){
            tempList.add(map.getValue());
        }
        Collections.sort(tempList);

        if(tempList.size() % 2 == 0){
            twoMiddleValues = tempList.get(tempList.size()/2) + tempList.get(tempList.size()/2-1);
            median = twoMiddleValues/2;
        } else {
            median = tempList.get(tempList.size()/2);
        }

        return median;

    }


    }


