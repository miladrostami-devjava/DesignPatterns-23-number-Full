package org.example;

import org.example.dp.Observer;
import org.example.dp.User;
import org.example.dp.WeatherMonitoringStation;
import org.example.dp.WeatherStation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeatherStation weatherStation
                = new WeatherMonitoringStation();
        Observer user1 = new User("milad");
        Observer user2 = new User("zahra");
        Observer user3 = new User("sara");
        weatherStation.registerObserver(user1);
        weatherStation.registerObserver(user2);
        weatherStation.registerObserver(user3);
        weatherStation.setMeasurement(44.3,22.12);
//weatherStation.notifyObservers();



    }
}
