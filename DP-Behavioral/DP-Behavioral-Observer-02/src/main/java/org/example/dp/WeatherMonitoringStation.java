package org.example.dp;

import java.util.ArrayList;
import java.util.List;

public class WeatherMonitoringStation implements WeatherStation{
private double temperature;
private double humidity;
private List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
observers.forEach(observer -> observer.update(temperature,humidity));
    }

    @Override
    public void setMeasurement(double temperature, double humidity) {
this.temperature = temperature;
this.humidity = humidity;
notifyObservers();
    }
}
