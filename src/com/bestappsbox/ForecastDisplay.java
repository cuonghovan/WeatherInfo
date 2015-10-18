package com.bestappsbox;

/**
 * Created by cuonghv on 10/18/15.
 */
public class ForecastDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherDataSubject;

    public ForecastDisplay(Subject weatherDataSubject){
        this.weatherDataSubject = weatherDataSubject;
        weatherDataSubject.registerObserver(this);
    }

    @Override
    public void updateMeasures(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast dis:"  + temperature + "C degree, " + humidity + "% humidity" + pressure + "pressure") ;
    }
}
