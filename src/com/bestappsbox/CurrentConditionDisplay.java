package com.bestappsbox;

/**
 * Created by cuonghv on 10/18/15.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherDataSubject;

    public CurrentConditionDisplay(Subject weatherDataSubject){
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
        System.out.println("Current weather condition: " + temperature + "C degree, " + humidity + "% humidity" + pressure + "pressure");
    }

}
