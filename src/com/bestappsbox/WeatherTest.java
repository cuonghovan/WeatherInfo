package com.bestappsbox;

public class WeatherTest {

    public static void main(String[] args) {
        WeatherData weatherDataSubject = new WeatherData();
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherDataSubject);
        Observer statisticDisplay = new StatisticDisplay(weatherDataSubject);
        Observer forecastDisplay = new ForecastDisplay(weatherDataSubject);
        weatherDataSubject.setMeasures(25,80,35);
        weatherDataSubject.setMeasures(27,83,65);
    }
}
