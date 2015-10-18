package com.bestappsbox;

import java.util.ArrayList;

/**
 * Created by cuonghv on 10/18/15.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int removedIndex = observers.indexOf(observer);
        if (removedIndex >= 0){
            observers.remove(removedIndex);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i < observers.size();i++){
            Observer observerItem = (Observer)observers.get(i);
            observerItem.updateMeasures(temperature, humidity, pressure);
        }
    }

    public void measuresChange(){
        notifyObserver();
    }

    public void setMeasures(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measuresChange();
    }
}
