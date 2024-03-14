package org.example.dp;

public interface WeatherStation {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setMeasurement(double temperature,double humidity);


}
